package ru.mipt.app.view;

import javafx.scene.canvas.GraphicsContext;
import ru.mipt.app.model.Point;

import java.util.List;

public class SnakeView extends GeneralView {

    private GraphicsContext gc;

    private Point currHead;
    private Point nextHead;

    private List<Point> currTail;
    private List<Point> nextTail;

    public SnakeView(GraphicsContext gc, Point head, List<Point> tail) {

    }
}
