package ru.mipt.app.control.listeners;

import javafx.animation.Animation;
import javafx.beans.value.ChangeListener;
import javafx.beans.value.ObservableValue;
import ru.mipt.app.control.Processor;

public class StatusChangeListener implements ChangeListener<Animation.Status> {

    private Processor processor;

    public StatusChangeListener(Processor processor) {
        this.processor = processor;
    }

    @Override
    public void changed(ObservableValue<? extends Animation.Status> observableValue, Animation.Status gameStatus,
                        Animation.Status currStatus) {
        switch (currStatus) {
            case RUNNING:
                processor.run();
                break;
            case STOPPED:
                processor.stop();
                break;
        }
    }
}
