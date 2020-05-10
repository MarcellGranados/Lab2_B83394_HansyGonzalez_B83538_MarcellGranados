package Ejercicio2;

/**
 *
 * @author Hansy Gonzalez
 * @author Marcell Granados
 */
public interface AbstractBuilder {

    void newFigure();

    void newPoint(Point c);

    Figure getFigureCreated();
}
