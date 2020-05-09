package Ejercicio2;

/**
 *
 * @author Hansy Gonzalez
 * @author Marcell Granados
 */
public class RectangleFactory implements FactoryInterface {

    @Override
    public CoordinatesFigures newFigure(Coordinates c, int... num) {
        return new Rectangle(c, num[0], num[1]);
    }

}
