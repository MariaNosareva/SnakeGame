package ru.mipt.app.control;

import javafx.animation.Animation;
import javafx.fxml.FXML;
import javafx.scene.canvas.Canvas;
import javafx.scene.canvas.GraphicsContext;
import ru.mipt.app.control.food.ChangeFruitColorDecorator;
import ru.mipt.app.control.food.FoodController;
import ru.mipt.app.control.food.FruitController;
import ru.mipt.app.model.GameModel;
import ru.mipt.app.model.Snake;
import ru.mipt.app.view.SnakeView;
import ru.mipt.app.view.food.RectangularFruitView;
import ru.mipt.app.view.food.RectangularFruitViewBuilder;

public class GameController {

    @FXML
    private Canvas canvas;

    private GameModel gameModel;
    public GameController() {  }

    @FXML
    void initialize() {
        this.gameModel = GameModel.getInstance();
        GraphicsContext gc = this.canvas.getGraphicsContext2D();

        Processor processor = new Processor();
        Snake snake = Snake.getInstance();
        SnakeController snakeController = new SnakeController(new SnakeView(gc, snake.getHead(), snake.getTail()), processor);

        RectangularFruitView view = (new RectangularFruitViewBuilder(GameModel.getInstance().getFoodColor(), gc)
                                    .setSquare(true)
                                    .setRhombus(true)).build();
        FoodController fruitController = new ChangeFruitColorDecorator(new FruitController(view, processor));

        gameModel.status.setValue(Animation.Status.RUNNING);
    }
}
