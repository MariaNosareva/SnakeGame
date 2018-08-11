package ru.mipt.app.control;

import javafx.scene.canvas.GraphicsContext;
import ru.mipt.app.model.Direction;
import ru.mipt.app.model.GameModel;
import ru.mipt.app.model.Point;
import ru.mipt.app.model.Snake;
import ru.mipt.app.view.SnakeView;

import java.util.ArrayList;
import java.util.List;

public class SnakeController {
    private Snake snake;
    private SnakeView view;

    SnakeController(SnakeView view, Processor processor) {
        this.snake = Snake.getInstance();
        this.view = view;

        processor.addAction(this::move);
    }

    public void move() {

        this.setNewDirection(GameModel.getInstance().direction.get());
        snake.setCurrDirection(snake.getNextDirection());
        Point newHead = newHead(snake.getHead(), snake.getCurrDirection());

        if (newHead.getY() < 0 || newHead.getX() < 0 ||
                newHead.getX() >= 561 || newHead.getY() >= 561 ||
                snake.getTail().contains(newHead)) {
            GameModel.getInstance().collision.set(true);
            return;
        }

        // TODO if newHead == food
        //    tail.add(head)
        // else

        List<Point> tail = new ArrayList<>(snake.getTail());
        tail.remove(0);
        tail.add(snake.getHead());

        view.setNextBody(newHead, tail);
        view.draw();

        snake.setHead(newHead);
        snake.setTail(tail);

    }

    private Point newHead(Point oldHead, Direction direction) {
        int newX = 0;
        int newY = 0;
        int radius = GameModel.getInstance().getpointRadius();

        switch (direction) {
            case UP:
                newX = 0;
                newY = -radius;
                break;
            case DOWN:
                newX = 0;
                newY = radius;
                break;
            case RIGHT:
                newX = radius;
                newY = 0;
                break;
            case LEFT:
                newX = -radius;
                newY = 0;
                break;
        }

        return new Point(oldHead.getX() + newX, oldHead.getY() + newY);
    }

    public void setNewDirection(Direction newDirection) {

        if (newDirection == Direction.LEFT && snake.getCurrDirection() != Direction.RIGHT ||
                newDirection == Direction.RIGHT && snake.getCurrDirection() != Direction.LEFT ||
                newDirection == Direction.UP && snake.getCurrDirection() != Direction.DOWN ||
                newDirection == Direction.DOWN && snake.getCurrDirection() != Direction.UP) {

            snake.setNextDirection(newDirection);
        }
    }
}
