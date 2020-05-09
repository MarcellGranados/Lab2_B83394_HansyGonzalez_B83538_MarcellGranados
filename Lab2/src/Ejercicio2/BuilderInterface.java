package Ejercicio2;

/**
 *
 * @author Hansy Gonzalez
 * @author Marcell Granados
 */
public interface BuilderInterface {

    void newFigure();

    void newCoordinated(Coordinates c) throws PersonalizedException;

    Figures getFigureCreated() throws PersonalizedException;
}
