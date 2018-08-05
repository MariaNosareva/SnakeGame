package ru.mipt.app.model;

import javafx.fxml.FXML;
import javafx.scene.canvas.Canvas;
import javafx.scene.canvas.GraphicsContext;
import javafx.scene.input.KeyEvent;
import javafx.scene.layout.BorderPane;
import javafx.scene.paint.Color;

public class GameController {

    @FXML
    private BorderPane root;

    @FXML
    private Canvas canvas;

    public GameController() {  }

    @FXML
    void initialize() {
        GraphicsContext gc = canvas.getGraphicsContext2D();
    }

    @FXML
    void handleKeyPressed(KeyEvent event) { //TODO
        switch (event.getCode()) {
            case RIGHT:
                break;
            case LEFT:
                break;
            case UP:
                break;
            case DOWN:
                break;
            case ESCAPE:
                System.exit(0);
                break;
        }
    }
}
