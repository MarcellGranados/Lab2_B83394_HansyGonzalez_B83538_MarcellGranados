package Ejercicio2;

/**
 *
 * @author Hansy Gonzalez
 * @author Marcell Granados
 */
public class CircleBuilder implements AbstractBuilder {

    Circle circle;

    @Override
    public void newFigure() {
        circle = new Circle();
    }

    @Override
    public void newCoordinated(Point c) {
        if (c.getX() >= 0 && c.getY() >= 0) {
            circle.setPoint(c);
        }
    }

    public void newRadius(int radius) {
        if (radius >= 0 && (circle.getPoint().getX() - radius) >= 0 && (circle.getPoint().getY() - radius) >= 0) {
            circle.setRadius(radius);
        }
    }

    @Override
    public Figure getFigureCreated() {
        return circle;
    }

}
