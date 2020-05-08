package Ejercicio2;

/**
 *
 * @author Hansy Gonzalez
 * @author Marcell Granados
 */
public class Rectangle extends CoordinatesFigures {

    int high;
    int width;

    public Rectangle() {
    }

    public Rectangle(Coordinates c, int high, int width) {
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
    public Object copy() {
        return new Rectangle((Coordinates) super.getC(), high, width);
    }

}
