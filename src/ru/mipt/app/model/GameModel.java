package ru.mipt.app.model;

import javafx.animation.Animation;
import javafx.beans.property.*;
import ru.mipt.app.model.food.Color;
import ru.mipt.app.model.food.ColorImpl;

public class GameModel {

    public ObjectProperty<Direction> direction = new SimpleObjectProperty<>(Direction.UP);
    public BooleanProperty collision = new SimpleBooleanProperty(false);
    public ObjectProperty<Animation.Status> status = new SimpleObjectProperty<>(Animation.Status.STOPPED);
    public BooleanProperty fruit = new SimpleBooleanProperty(false);
    // public BooleanProperty surprise = new SimpleBooleanProperty(false);
    private IntegerProperty speed = new SimpleIntegerProperty(10);
    private int pointRadius = 10;
    private Point foodPosition = new Point(200, 200);
    private Color foodColor = new ColorImpl(javafx.scene.paint.Color.TOMATO);

    private static GameModel ourInstance = new GameModel();

    public static GameModel getInstance() {
        return ourInstance;
    }

    private GameModel() {  }

    public void setSpeed(int speed) {
        this.speed = new SimpleIntegerProperty(speed);
    }

    public void setpointRadius(int pointRadius) {
        this.pointRadius = pointRadius;
    }

    public int getpointRadius() {
        return this.pointRadius;
    }

    public void setFoodPosition(Point foodPosition) {
        this.foodPosition = foodPosition;
    }

    public Point getFoodPosition() {
        return foodPosition;
    }

    public Color getFoodColor() {
        return foodColor;
    }

    public void setFoodColor(Color foodColor) {
        this.foodColor = foodColor;
    }
}
