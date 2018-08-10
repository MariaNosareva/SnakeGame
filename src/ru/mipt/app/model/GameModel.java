package ru.mipt.app.model;

import javafx.animation.Animation;
import javafx.beans.property.*;

public class GameModel {

    public ObjectProperty<Direction> direction = new SimpleObjectProperty<>(Direction.UP);
    public BooleanProperty collision = new SimpleBooleanProperty(false);
    public ObjectProperty<Animation.Status> status = new SimpleObjectProperty<>(Animation.Status.STOPPED);
    private IntegerProperty speed = new SimpleIntegerProperty(10);
    private int pointRadius = 15;

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
}
