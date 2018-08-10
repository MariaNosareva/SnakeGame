package ru.mipt.app.control;

import javafx.animation.Animation;
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
        System.out.println(gameModel.direction);
        GraphicsContext gc = this.canvas.getGraphicsContext2D();

        Processor processor = new Processor();
        Snake snake = Snake.getInstance();
        SnakeController snakeController = new SnakeController(new SnakeView(gc, snake.getHead(), snake.getTail()), processor);

        gameModel.status.setValue(Animation.Status.RUNNING);
        System.out.println(processor.getModelStatus());
    }
}
