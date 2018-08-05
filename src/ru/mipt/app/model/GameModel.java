package ru.mipt.app.model;

import javafx.beans.property.*;

public class GameModel {

    public ObjectProperty<Direction> direction = new SimpleObjectProperty<>(Direction.RIGHT);
    public BooleanProperty collision = new SimpleBooleanProperty(false);
    public ObjectPropertyBase<GameStatus> status = new SimpleObjectProperty<>(GameStatus.STOPPED);
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
