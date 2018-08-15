package ru.mipt.app.view.food;

import javafx.scene.canvas.GraphicsContext;
import ru.mipt.app.model.food.Color;

public class FruitView {

    protected Color color;
    protected GraphicsContext gc;

    FruitView(Color color, GraphicsContext gc) {
        this.color = color;
        this.gc = gc;
    }

    public void setColor(Color color) {
        this.color = color;
    }

    public void drawFruit(int x, int y) {  }
}
