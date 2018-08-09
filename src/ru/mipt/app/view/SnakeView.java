package ru.mipt.app.view;

import javafx.scene.canvas.GraphicsContext;
import javafx.scene.paint.Color;
import ru.mipt.app.model.GameModel;
import ru.mipt.app.model.Point;

import java.util.List;

public class SnakeView {

    private GraphicsContext gc;

    private Point currHead;
    private Point nextHead;

    private List<Point> currTail;
    private List<Point> nextTail;

    public SnakeView(GraphicsContext gc, Point head, List<Point> tail) {
        this.gc = gc;
        this.currTail = tail;
        this.nextTail = tail;
        this.currHead = head;
        this.nextHead = head;
    }

    public void setNextBody(Point head, List<Point> tail) {
        this.nextHead = head;
        this.nextTail = tail;
    }

    public GraphicsContext draw() {

        GameModel model = GameModel.getInstance();
        int radius = model.getpointRadius();

        if (this.currHead == this.nextHead) {
            if (this.currTail == this.nextTail) {
                this.gc.setFill(Color.LAWNGREEN);
                this.gc.fillOval(this.currHead.getX(), this.currHead.getY(), radius, radius);
                for (Point point: this.currTail) {
                    this.gc.fillOval(point.getX(), point.getY(), radius, radius);
                }
            }
            return this.gc;
        }

        Point last = currTail.get(currTail.size() - 1); // maybe first??!

        this.gc.clearRect(last.getX(), last.getY(), radius, radius);
        this.gc.setFill(Color.LAWNGREEN);
        this.gc.fillOval(this.nextHead.getX(), this.nextHead.getY(), radius, radius);

        return this.gc;
    }
}
