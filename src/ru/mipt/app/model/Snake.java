package ru.mipt.app.model;

import java.util.ArrayList;
import java.util.List;

public class Snake {

    private Point head;
    private List<Point> tail;
    private Direction currDirection;
    private Direction nextDirection;

    Snake(GameModel gameModel) {
        this.setHead(new Point(20, 20));
        this.tail = new ArrayList<>();
        this.currDirection = gameModel.direction.get();
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
}
