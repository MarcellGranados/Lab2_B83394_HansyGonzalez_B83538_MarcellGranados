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
            circle.setCoordinates(c);
        }
    }

    public void newRadius(int radius) {
        if (radius >= 0 && (circle.getCoordinates().getX() - radius) >= 0 && (circle.getCoordinates().getY() - radius) >= 0) {
            circle.setRadius(radius);
        }
    }

    @Override
    public Figures getFigureCreated() {
        return circle;
    }

}
