package ru.mipt.app.control.listeners;

import javafx.animation.Animation;
import javafx.event.EventHandler;
import javafx.scene.input.KeyCode;
import javafx.scene.input.KeyEvent;
import ru.mipt.app.model.Direction;
import ru.mipt.app.model.GameModel;

public class KeyboardListener implements EventHandler<KeyEvent> {

    private GameModel gameModel;

    public KeyboardListener() {
        this.gameModel = GameModel.getInstance();
    }

    @Override
    public void handle(KeyEvent keyEvent) {
        KeyCode keyCode = keyEvent.getCode();

        switch (keyCode) {
            case UP:
                gameModel.direction.setValue(Direction.UP);
                break;
            case DOWN:
                gameModel.direction.setValue(Direction.DOWN);
                break;
            case LEFT:
                gameModel.direction.setValue(Direction.LEFT);
                break;
            case RIGHT:
                gameModel.direction.setValue(Direction.RIGHT);
                break;
            case ESCAPE:
                gameModel.status.set(Animation.Status.STOPPED);
                System.exit(0);
                break;
        }
    }
}
