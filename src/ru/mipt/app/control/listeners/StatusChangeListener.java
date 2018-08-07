package ru.mipt.app.control.listeners;

import javafx.beans.value.ChangeListener;
import javafx.beans.value.ObservableValue;
import ru.mipt.app.model.GameStatus;

public class StatusChangeListener implements ChangeListener<GameStatus> {
    @Override
    public void changed(ObservableValue<? extends GameStatus> observableValue, GameStatus gameStatus, GameStatus currStatus) {
        switch (currStatus) {
            case PLAYING:
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
