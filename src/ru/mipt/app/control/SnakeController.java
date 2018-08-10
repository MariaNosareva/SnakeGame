package ru.mipt.app.control;

import javafx.scene.canvas.GraphicsContext;
import ru.mipt.app.model.Direction;
import ru.mipt.app.model.GameModel;
import ru.mipt.app.model.Point;
import ru.mipt.app.model.Snake;
import ru.mipt.app.view.SnakeView;

import java.util.List;

public class SnakeController {
    private Snake snake;
    private SnakeView view;

    SnakeController(Snake snake, SnakeView view, Processor processor) {
        this.snake = snake;
        this.view = view;

        GameModel.getInstance().direction.addListener((observable, currDirection, nextDirection) ->
                this.snake.setNextDirection(nextDirection));

        processor.addAction(this::move);
    }

    public void move() {
        System.out.println("it works");
        snake.setCurrDirection(snake.getNextDirection());
        Point newHead = newHead(snake.getHead(), snake.getCurrDirection());

        if (newHead.getY() < 0 || newHead.getX() < 0 ||
                newHead.getX() >= 40 || newHead.getY() >= 40 ||
                snake.getTail().contains(newHead)) {
            GameModel.getInstance().collision.set(true);
            return;
        }

        // TODO if newHead == food
        //    tail.add(head)
        // else

        List<Point> tail = snake.getTail();
        tail.remove(0);
        tail.add(snake.getHead());
        snake.setHead(newHead);
        snake.setTail(tail);

        view.setNextBody(newHead, tail);
        view.draw();
    }

    private Point newHead(Point oldHead, Direction direction) {
        int newX = 0;
        int newY = 0;
        int radius = GameModel.getInstance().getpointRadius();

        switch (direction) {
            case UP:
                newX = 0;
                newY = -radius*2;
                break;
            case DOWN:
                newX = 0;
                newY = radius*2;
                break;
            case RIGHT:
                newX = radius*2;
                newY = 0;
                break;
            case LEFT:
                newX = -radius*2;
                newY = 0;
                break;
        }

        return new Point(oldHead.getX() + newX, oldHead.getY() + newY);
    }
}
