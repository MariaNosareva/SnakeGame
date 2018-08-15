package ru.mipt.app.view.food;

import javafx.scene.canvas.GraphicsContext;
import ru.mipt.app.model.GameModel;
import ru.mipt.app.model.food.Color;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class RectangularFruitView extends FruitView {

    private final List<String> shapes = new ArrayList<>();
    private Random random;

    RectangularFruitView(Color color, GraphicsContext gc, boolean square, boolean rhombus, boolean roundSquare) {
        super(color, gc);

        if (square) {
            shapes.add("square");
        }
        if (rhombus) {
            shapes.add("rhombus");
        }
        if (roundSquare) {
            shapes.add("roundSquare");
        }

        random = new Random();
    }

    @Override
    public void drawFruit(int x, int y) {

        int randShapeIndex = random.nextInt(shapes.size());
        String shape = shapes.get(randShapeIndex);

        int radius = GameModel.getInstance().getpointRadius();
        gc.setFill(color.getColor());
        switch (shape) {
            case "square":
                gc.fillRect(x, y, radius*2, radius*2);
                break;
            case "rhombus":
                double xes[] = {x, x + radius, x + radius*2, x + radius};
                double yes[] = {y + radius, y + radius*2, y + radius, y};
                gc.fillPolygon(xes, yes, 4);
                break;
            case "roundSquare":
                gc.fillRoundRect(x, y, radius*2, radius*2, radius/5, radius/5);
                break;
        }
    }
}
