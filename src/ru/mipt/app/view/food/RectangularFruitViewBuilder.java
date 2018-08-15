package ru.mipt.app.view.food;

import javafx.scene.canvas.GraphicsContext;
import ru.mipt.app.model.food.Color;

public class RectangularFruitViewBuilder {

    private boolean square;
    private boolean rhombus;
    private boolean roundSquare;
    private Color color;
    private GraphicsContext gc;

    public RectangularFruitViewBuilder(Color color, GraphicsContext gc) {
        this.color = color;
        this.gc = gc;
    }

    public RectangularFruitViewBuilder setRhombus(boolean rhombus) {
        this.rhombus = rhombus;
        return this;
    }

    public RectangularFruitViewBuilder setRoundSquare(boolean roundSquare) {
        this.roundSquare = roundSquare;
        return this;
    }

    public RectangularFruitViewBuilder setSquare(boolean square) {
        this.square = square;
        return this;
    }

    public RectangularFruitView build() {
        if (!square && !rhombus && !roundSquare) {
            return new RectangularFruitView(color, gc, true, false, false);
        }
        return new RectangularFruitView(color, gc, square, rhombus, roundSquare);
    }
}
