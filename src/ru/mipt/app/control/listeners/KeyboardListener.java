package ru.mipt.app.control.listeners;

import javafx.event.EventHandler;
import javafx.scene.input.KeyCode;
import javafx.scene.input.KeyEvent;
import ru.mipt.app.model.Direction;
import ru.mipt.app.model.GameModel;
import ru.mipt.app.model.GameStatus;

public class KeyboardListener implements EventHandler<KeyEvent> {

    private GameModel gameModel;

    KeyboardListener(GameModel model) {
        this.gameModel = model;
    }

    @Override
    public void handle(KeyEvent keyEvent) {
        KeyCode keyCode = keyEvent.getCode();
        switch (keyCode) {
            case UP:
                if (gameModel.direction.get() != Direction.DOWN) {
                    gameModel.direction.setValue(Direction.UP);
                }
                break;
            case DOWN:
                if (gameModel.direction.get() != Direction.UP) {
                    gameModel.direction.setValue(Direction.DOWN);
                }
                break;
            case LEFT:
                if (gameModel.direction.get() != Direction.RIGHT) {
                    gameModel.direction.setValue(Direction.LEFT);
                }
                break;
            case RIGHT:
                if (gameModel.direction.get() != Direction.LEFT) {
                    gameModel.direction.setValue(Direction.RIGHT);
                }
                break;
            case ESCAPE:
                gameModel.status.set(GameStatus.STOPPED);
                System.exit(0);
                break;
        }
    }
}
