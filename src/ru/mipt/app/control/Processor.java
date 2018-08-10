package ru.mipt.app.control;

import javafx.animation.Animation;
import javafx.animation.KeyFrame;
import javafx.animation.Timeline;
import javafx.util.Duration;
import ru.mipt.app.control.listeners.CollisionListener;
import ru.mipt.app.control.listeners.StatusChangeListener;
import ru.mipt.app.model.GameModel;

import java.util.ArrayList;
import java.util.List;

public class Processor {

    private Timeline timeline;
    private GameModel model = GameModel.getInstance();
    private List<Runnable> actions = new ArrayList<>();

    public Processor() {
        model.collision.addListener(new CollisionListener());

        timeline = new Timeline(new KeyFrame(Duration.millis(500), event ->
                actions.forEach(Runnable::run)));
        timeline.setCycleCount(Animation.INDEFINITE);
        timeline.statusProperty().addListener((observable, oldStatus, newStatus) ->
                model.status.set(newStatus));
        model.status.addListener(new StatusChangeListener(this));
    }

    public Animation.Status getModelStatus() {
        return model.status.get();
    }

    public void addAction(Runnable action) {
        this.actions.add(action);
    }

    public void run() {
        timeline.play();
    }

    public void stop() {
        timeline.stop();
    }

    public void pause() {
        timeline.pause();
    }
}
