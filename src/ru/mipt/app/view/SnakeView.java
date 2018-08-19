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

        draw();
    }

    public void setNextBody(Point head, List<Point> tail) {
        this.nextHead = head;
        this.nextTail = tail;
    }

    public GraphicsContext draw() {
        int radius = GameModel.getInstance().getpointRadius();

        if (this.currHead == this.nextHead) {
            if (this.currTail == this.nextTail) {
                this.gc.setFill(Color.GREEN);
                this.gc.fillOval(this.currHead.getX(), this.currHead.getY(), radius*2, radius*2);
                for (Point point: this.currTail) {
                    this.gc.fillOval(point.getX(), point.getY(), radius*2, radius*2);
                }
            }
            return this.gc;
        }

        Point last = currTail.get(0);

        this.gc.clearRect(last.getX(), last.getY(), radius*2, radius*2);
        this.gc.clearRect(nextHead.getX(), nextHead.getY(), radius*2, radius*2);

        this.gc.setFill(Color.GREEN);
        this.gc.fillOval(this.nextHead.getX(), this.nextHead.getY(), radius*2, radius*2);
        this.gc.fillOval(this.nextTail.get(0).getX(), this.nextTail.get(0).getY(), radius*2, radius*2);

        this.currHead = this.nextHead;
        this.currTail = this.nextTail;

        return this.gc;
    }
}
