package ru.mipt.app.control.listeners;

import javafx.animation.Animation;
import javafx.beans.value.ChangeListener;
import javafx.beans.value.ObservableValue;

public class StatusChangeListener implements ChangeListener<Animation.Status> {
    @Override
    public void changed(ObservableValue<? extends Animation.Status> observableValue, Animation.Status gameStatus,
                        Animation.Status currStatus) {
        switch (currStatus) {
            case RUNNING:
                // TODO start game
                break;
            case PAUSED:
                // TODO pause game
                break;
            case STOPPED:
                // TODO stop game
        }
    }
}
