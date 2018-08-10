package ru.mipt.app.control;

import javafx.fxml.FXML;
import javafx.scene.canvas.Canvas;
import javafx.scene.canvas.GraphicsContext;
import ru.mipt.app.model.GameModel;
import ru.mipt.app.model.Point;
import ru.mipt.app.model.Snake;
import ru.mipt.app.view.SnakeView;

public class GameController {

    @FXML
    private Canvas canvas;

    private GameModel gameModel;
    public GameController() {  }

    @FXML
    void initialize() {
        this.gameModel = GameModel.getInstance();
        GraphicsContext gc = this.canvas.getGraphicsContext2D();
        Snake snake = new Snake(gameModel);
        SnakeController snakeController = new SnakeController(snake, new SnakeView(gc, snake.getHead(), snake.getTail()));

    }
}
