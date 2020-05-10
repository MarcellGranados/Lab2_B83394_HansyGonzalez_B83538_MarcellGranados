package Ejercicio2;

/**
 *
 * @author Hansy Gonzalez
 * @author Marcell Granados
 */
public interface AbstractBuilder {

    void newFigure();

    void newCoordinated(Point c) throws PersonalizedException;

    Figure getFigureCreated() throws PersonalizedException;
}
