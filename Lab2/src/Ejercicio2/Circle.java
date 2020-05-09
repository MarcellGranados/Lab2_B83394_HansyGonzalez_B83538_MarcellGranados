package Ejercicio2;

/**
 *
 * @author Hansy Gonzalez
 * @author Marcell Granados
 */
public class Circle extends Figures {

    int radius;

    public Circle() {
    }

    public Circle(Coordinates c, int radius) {
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
    public Object copy() {
        return new Circle((Coordinates) super.getCoordinates(), radius);
    }

}
