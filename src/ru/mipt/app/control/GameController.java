package ru.mipt.app.control;

import javafx.fxml.FXML;
import javafx.scene.canvas.Canvas;
import javafx.scene.canvas.GraphicsContext;
import ru.mipt.app.model.GameModel;
import ru.mipt.app.model.Snake;

public class GameController {

    @FXML
    private Canvas canvas;

    private GameModel gameModel;
    public GameController() {  }

    @FXML
    void initialize() {
        this.gameModel = GameModel.getInstance();
        GraphicsContext gc = this.canvas.getGraphicsContext2D();
        SnakeController snake = new SnakeController(new Snake(gameModel));
    }
}
