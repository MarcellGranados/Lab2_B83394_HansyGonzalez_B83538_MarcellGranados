package Ejercicio2;

/**
 *
 * @author Hansy Gonzalez
 * @author Marcell Granados
 */
public class CircleFactory implements FactoryInterface {

    private Builder builder = new Builder();

    @Override
    public Figure newFigure(Point point, int... num) throws PersonalizedException {
        return builder.newCircle(point, num[0]);
    }

}
