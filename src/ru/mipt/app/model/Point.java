package ru.mipt.app.model;

public class Point {
    private int x;
    private int y;

    public Point(int x, int y) {
        this.setX(x);
        this.setY(y);
    }

    public Point() {
        setX(0);
        setY(0);
    }

    @Override
    public boolean equals(Object o) {
        if (o == null) {
            return false;
        }
        Point other = (Point) o;
        if (x == other.getX() && y == other.getY()) {
            return true;
        }
        return false;
    }

    public int getX() {
        return x;
    }

    public void setX(int x) {
        this.x = x;
    }

    public int getY() {
        return y;
    }

    public void setY(int y) {
        this.y = y;
    }
}
