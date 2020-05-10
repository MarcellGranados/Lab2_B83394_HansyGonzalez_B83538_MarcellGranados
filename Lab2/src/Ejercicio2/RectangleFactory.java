package Ejercicio2;

/**
 *
 * @author Hansy Gonzalez
 * @author Marcell Granados
 */
public class RectangleFactory implements FactoryInterface {

    private Builder builder = new Builder();

    @Override
    public Figure newFigure(Point point, int... num) throws PersonalizedException {
        return builder.newRectangle(point, num[0], num[1]);
    }

}
