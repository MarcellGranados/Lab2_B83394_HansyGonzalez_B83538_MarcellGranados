package Ejercicio2;

/**
 *
 * @author Hansy Gonzalez
 * @author Marcell Granados
 */
public class RectangleBuilder implements AbstractBuilder {

    Rectangle rectangle;

    @Override
    public void newFigure() {
        rectangle = new Rectangle();
    }

    @Override
    public void newCoordinated(Point c) {
        if (c.getX() >= 0 && c.getY() >= 0) {
            rectangle.setPoint(c);
        }
    }

    public void newHigh(int high) {
        if (high >= 0 && (rectangle.getPoint().getX() - high) >= 0 && (rectangle.getPoint().getY() - high) >= 0) {
            rectangle.setHigh(high);
        }
    }

    public void newWidth(int width) {
        if (width >= 0 && (rectangle.getPoint().getX() - width) >= 0 && (rectangle.getPoint().getY() - width) >= 0) {
            rectangle.setWidth(width);
        }
    }

    @Override
    public Figure getFigureCreated() {
        return rectangle;
    }

}
