package Ejercicio2;

/**
 *
 * @author Hansy Gonzalez
 * @author Marcell Granados
 */
public interface FactoryInterface {

    Figures newFigure(Coordinates c, int... num);
}
