package ru.mipt.app.control;

import ru.mipt.app.model.Point;
import ru.mipt.app.model.Snake;
import ru.mipt.app.model.food.Food;

public class FruitController {

    private Snake snake = Snake.getInstance();

    public FruitController(Processor processor) { // TODO FruitView view

        // TODO processor.addAction(this::changeFruitPosition); не каждый frame!
    }

    public void changeFruitPosition() {
        Point head = snake.getHead();
    }
}
