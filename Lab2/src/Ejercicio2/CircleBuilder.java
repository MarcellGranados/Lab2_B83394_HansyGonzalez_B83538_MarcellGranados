package Ejercicio2;

/**
 *
 * @author Hansy Gonzalez
 * @author Marcell Granados
 */
public class CircleBuilder implements BuilderInterface {

    Circle circle;

    @Override
    public void newFigure() {
        circle = new Circle();
    }

    @Override
    public void newCoordinated(Coordinates c) {
        if (c.getX() >= 0 && c.getY() >= 0) {
            circle.setC(c);
        }
    }

    public void newRadius(int radius) {
        if (radius >= 0 && (circle.getC().getX() - radius) >= 0 && (circle.getC().getY() - radius) >= 0) {
            circle.setRadius(radius);
        }
    }

    @Override
    public CoordinatesFigures getFigureCreated() {
        return circle;
    }

}
