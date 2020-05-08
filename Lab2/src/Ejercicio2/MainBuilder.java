package Ejercicio2;

/**
 *
 * @author Hansy Gonzalez
 * @author Marcell Granados
 */
public class MainBuilder {

    public CoordinatesFigures newCircle(Coordinates c, int radius) {
        CircleBuilder cb = new CircleBuilder();
        cb.newFigure();
        cb.newCoordinated(c);
        cb.newRadius(radius);
        return cb.getFigureCreated();
    }
    
    public CoordinatesFigures newRectangle(Coordinates c, int high, int width) {
        RectangleBuilder cb = new RectangleBuilder();
        cb.newFigure();
        cb.newCoordinated(c);
        cb.newHigh(high);
        cb.newWidth(width);
        return cb.getFigureCreated();
    }
}
