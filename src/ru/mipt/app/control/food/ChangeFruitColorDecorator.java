package ru.mipt.app.control.food;

import ru.mipt.app.model.GameModel;
import ru.mipt.app.model.food.Color;
import ru.mipt.app.model.food.ColorImpl;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class ChangeFruitColorDecorator implements FoodController {

    private FoodController controller;
    private final List<Color> colors = new ArrayList<>();

    public ChangeFruitColorDecorator(FoodController controller) {
        this.controller = controller;

        colors.add(new ColorImpl(javafx.scene.paint.Color.TOMATO));
        colors.add(new ColorImpl(javafx.scene.paint.Color.VIOLET));
        colors.add(new ColorImpl(javafx.scene.paint.Color.INDIGO));
        colors.add(new ColorImpl(javafx.scene.paint.Color.DARKSALMON));

        Random random = new Random();
        GameModel.getInstance().setFoodColor(colors.get(random.nextInt(colors.size())));
    }
}
