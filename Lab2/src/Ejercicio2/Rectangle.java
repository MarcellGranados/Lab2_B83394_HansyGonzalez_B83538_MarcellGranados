package Ejercicio2;

/**
 *
 * @author Hansy Gonzalez
 * @author Marcell Granados
 */
public class Rectangle extends Figure {

    int high;
    int width;

    public Rectangle() {
    }

    public Rectangle(Point c, int high, int width) {
        super(c);
        this.high = high;
        this.width = width;
    }

    public int getHigh() {
        return high;
    }

    public void setHigh(int high) {
        this.high = high;
    }

    public int getWidth() {
        return width;
    }

    public void setWidth(int width) {
        this.width = width;
    }

    @Override
    public String toString() {
        return "Rectangulo{" + "Altura=" + high + ", Anchura=" + width + super.toString() + '}';
    }

    @Override
    public MuralComponent copy() {
        return new Rectangle((Point) getPoint().copy(), high, width);
    }

    @Override
    public String informationFigure() {
        return toString();
    }

}
