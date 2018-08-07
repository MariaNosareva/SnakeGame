package ru.mipt.app.control.listeners;

import javafx.beans.value.ChangeListener;
import javafx.beans.value.ObservableValue;
import ru.mipt.app.model.Direction;
import ru.mipt.app.model.Snake;

public class DirectionListener implements ChangeListener<Direction> {

    private Snake snake;

    DirectionListener(Snake snake) {
        this.snake = snake;
    }

    @Override
    public void changed(ObservableValue<? extends Direction> observableValue, Direction currDirection, Direction nextDirection) {
        this.snake.setNextDirection(nextDirection);
    }
}
