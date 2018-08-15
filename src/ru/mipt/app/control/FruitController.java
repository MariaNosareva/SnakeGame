package ru.mipt.app.control;

import javafx.scene.paint.Color;
import ru.mipt.app.model.Point;
import ru.mipt.app.model.Snake;
import ru.mipt.app.model.food.ColorImpl;
import ru.mipt.app.model.food.Food;

import java.util.ArrayList;
import java.util.List;

public class FruitController {

    private Snake snake = Snake.getInstance();
    private final Food fruit = new Food(new ColorImpl(Color.LIGHTCORAL));
    // private final Food surprise = new Food(new ColorImpl(Color.TOMATO));

    public FruitController(Processor processor) { // TODO FruitView view

        // TODO processor.addAction(this::changeFruitPosition); не каждый frame!
    }

    public void changeFruitPosition() {
        Point head = snake.getHead();
        List<Point> tail = new ArrayList<>(snake.getTail());
    }
}
