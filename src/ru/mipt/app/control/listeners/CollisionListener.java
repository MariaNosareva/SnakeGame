package ru.mipt.app.control.listeners;

import javafx.beans.value.ChangeListener;
import javafx.beans.value.ObservableValue;

public class CollisionListener implements ChangeListener<Boolean> {

    @Override
    public void changed(ObservableValue<? extends Boolean> observableValue, Boolean aBoolean, Boolean collide) {
        if (collide) {
            // TODO stop game
        }
    }
}
