package Ejercicio2;

/**
 *
 * @author Hansy Gonzalez
 * @author Marcell Granados
 */
public class RectangleFactory implements FactoryInterface {

    @Override
    public Figure newFigure(Point c, int... num) {
        return new Rectangle(c, num[0], num[1]);
    }

}
