package ru.mipt.app.control.listeners;

import javafx.beans.value.ChangeListener;
import javafx.beans.value.ObservableValue;
import ru.mipt.app.control.Processor;

public class CollisionListener implements ChangeListener<Boolean> {

    private Processor processor;

    public CollisionListener(Processor processor) {
        this.processor = processor;
    }

    @Override
    public void changed(ObservableValue<? extends Boolean> observableValue, Boolean aBoolean, Boolean collide) {
        if (collide) {
            processor.stop();
        }
    }
}
