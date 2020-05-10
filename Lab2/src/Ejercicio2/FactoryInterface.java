package Ejercicio2;

/**
 *
 * @author Hansy Gonzalez
 * @author Marcell Granados
 */
public interface FactoryInterface {

    Figure newFigure(Point c, int... num)throws PersonalizedException;
}
