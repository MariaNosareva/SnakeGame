package ru.mipt.app.control;

import javafx.scene.canvas.GraphicsContext;
import ru.mipt.app.model.Direction;
import ru.mipt.app.model.Snake;

public class SnakeController {
    private Snake snake;

    SnakeController(Snake snake) {
        this.snake = snake;
    }
}
