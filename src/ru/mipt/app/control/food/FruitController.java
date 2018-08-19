package ru.mipt.app.control.food;

import ru.mipt.app.control.Processor;
import ru.mipt.app.model.GameModel;
import ru.mipt.app.model.Point;
import ru.mipt.app.model.Snake;
import ru.mipt.app.view.food.FruitView;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class FruitController implements FoodController {

    private Snake snake = Snake.getInstance();
    private FruitView view;

    public FruitController(FruitView view, Processor processor) {
        this.view = view;

        processor.addAction(this::changeFruitPosition);
    }

    public void changeFruitPosition() {

        Point head = snake.getHead();
        List<Point> tail = new ArrayList<>(snake.getTail());

        if (GameModel.getInstance().fruit.get()) {
            return;
        }

        Random random = new Random();
        Point newFruitPosition = new Point();
        do {
            int randomX = random.nextInt(29) * 20;
            int randomY = random.nextInt(27) * 20;
            newFruitPosition.setX(randomX);
            newFruitPosition.setY(randomY);
        } while (head == newFruitPosition || tail.contains(newFruitPosition));

        view.setColor(GameModel.getInstance().getFoodColor());
        view.drawFruit(newFruitPosition.getX(), newFruitPosition.getY());
        GameModel.getInstance().fruit.setValue(true);
        GameModel.getInstance().setFoodPosition(newFruitPosition);
    }
}
