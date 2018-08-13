package ru.mipt.app.model.food;


public class ColorImpl implements Color {

    javafx.scene.paint.Color color;

    public ColorImpl(javafx.scene.paint.Color color) {
        this.color = color;
    }

    @Override
    public javafx.scene.paint.Color getColor() {
        return color;
    }

    @Override
    public void setColor(javafx.scene.paint.Color color) {
        this.color = color;
    }
}
