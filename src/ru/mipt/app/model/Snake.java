package ru.mipt.app.model;

import java.util.ArrayList;
import java.util.List;

public class Snake {

    private Point head;
    private List<Point> tail;
    private Direction currDirection;
    private Direction nextDirection;

    private static Snake ourInstance = new Snake();
    public static Snake getInstance() {
        return ourInstance;
    }

    private Snake() {
        this.setHead(new Point(80, 80));
        this.tail = new ArrayList<>();
        this.tail.add(new Point(80, 100));
        this.currDirection = GameModel.getInstance().direction.get();
        this.setNextDirection(this.currDirection);
    }


    public Point getHead() {
        return head;
    }

    public void setHead(Point head) {
        this.head = head;
    }

    public List<Point> getTail() {
        return this.tail;
    }

    public void addToTail(Point newTail) {
        this.tail.add(newTail);
    }

    public Direction getNextDirection() {
        return this.nextDirection;
    }

    public void setNextDirection(Direction nextDirection) {
        this.nextDirection = nextDirection;
    }

    public void setCurrDirection(Direction currDirection) {
        this.currDirection = currDirection;
    }

    public Direction getCurrDirection() {
        return this.currDirection;
    }

    public void setTail(List<Point> tail) {
        this.tail = tail;
    }
}
