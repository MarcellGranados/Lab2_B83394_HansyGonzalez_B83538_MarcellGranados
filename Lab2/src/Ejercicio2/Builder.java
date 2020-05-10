package Ejercicio2;

/**
 *
 * @author Hansy Gonzalez
 * @author Marcell Granados
 */
public class Builder {

    public Figure newCircle(Point c, int radius) throws PersonalizedException {
        CircleBuilder cb = new CircleBuilder();
        cb.newFigure();
        cb.newPoint(c);
        cb.newRadius(radius);
        String s = "";
        if (cb.circle.radius == 0) {
            s += " un radio valido";
        }
        if (cb.circle.getPoint() == null) {
            s += " unas coordenadas validas";
        }
        if (s != "") {
            throw new PersonalizedException("El circulo debe de poseer:" + s);
        }
        return cb.getFigureCreated();
    }

    public Figure newRectangle(Point point, int high, int width) throws PersonalizedException {
        RectangleBuilder rb = new RectangleBuilder();
        rb.newFigure();
        rb.newPoint(point);
        rb.newHigh(high);
        rb.newWidth(width);
        String s = "";
        if (rb.rectangle.high == 0) {
            s += " una altura valida";
        }
        if (rb.rectangle.width == 0) {
            s += " una anchura valida";
        }
        if (rb.rectangle.getPoint() == null) {
            s += " unas coordenadas validas";
        }
        if (s != "") {
            throw new PersonalizedException("El rectangulo debe de poseer:" + s);
        }
        return rb.getFigureCreated();
    }
}
