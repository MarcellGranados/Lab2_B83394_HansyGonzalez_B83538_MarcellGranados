package Ejercicio2;

/**
 *
 * @author Hansy Gonzalez
 * @author Marcell Granados
 */
public class Circle extends Figure {

    int radius;

    public Circle() {
    }

    public Circle(Point c, int radius) {
        super(c);
        this.radius = radius;
    }

    public int getRadius() {
        return radius;
    }

    public void setRadius(int radius) {
        this.radius = radius;
    }

    @Override
    public String toString() {
        return "Circulo{" + "Radio=" + radius + super.toString() + '}';
    }

    @Override
    public MuralComponent copy() {
        return new Circle((Point) getPoint().copy(), radius);
    }

    @Override
    public String informationFigure() {
        return toString();
    }

}
