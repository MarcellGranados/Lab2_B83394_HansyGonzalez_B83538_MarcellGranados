package Ejercicio2;

/**
 *
 * @author Hansy Gonzalez
 * @author Marcell Granados
 */
public class RectangleBuilder implements BuilderInterface {

    Rectangle rectangle;

    @Override
    public void newFigure() {
        rectangle = new Rectangle();
    }

    @Override
    public void newCoordinated(Coordinates c) {
        if (c.getX() >= 0 && c.getY() >= 0) {
            rectangle.setCoordinates(c);
        }
    }

    public void newHigh(int high) {
        if (high >= 0 && (rectangle.getCoordinates().getX() - high) >= 0 && (rectangle.getCoordinates().getY() - high) >= 0) {
            rectangle.setHigh(high);
        }
    }

    public void newWidth(int width) {
        if (width >= 0 && (rectangle.getCoordinates().getX() - width) >= 0 && (rectangle.getCoordinates().getY() - width) >= 0) {
            rectangle.setWidth(width);
        }
    }

    @Override
    public Figures getFigureCreated() {
        return rectangle;
    }

}
