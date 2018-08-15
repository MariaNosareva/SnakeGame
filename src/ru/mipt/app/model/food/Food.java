package ru.mipt.app.model.food;

import ru.mipt.app.model.Point;

public class Food extends Point {

    private Color color;

    public Food(Color color) {
        super(0, 0);
        this.color = color;
    }

    public void setPosition(int x, int y) {
        super.setX(x);
        super.setY(y);
    }
}
