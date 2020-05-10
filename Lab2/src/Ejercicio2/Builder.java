package Ejercicio2;

/**
 *
 * @author Hansy Gonzalez
 * @author Marcell Granados
 */
public class Builder {

    public Figure newCircle(Point c, int radius) {
        CircleBuilder cb = new CircleBuilder();
        cb.newFigure();
        cb.newCoordinated(c);
        cb.newRadius(radius);
        return cb.getFigureCreated();
    }
    
    public Figure newRectangle(Point c, int high, int width) {
        RectangleBuilder rb = new RectangleBuilder();
        rb.newFigure();
        rb.newCoordinated(c);
        rb.newHigh(high);
        rb.newWidth(width);
        return rb.getFigureCreated();
    }
}
