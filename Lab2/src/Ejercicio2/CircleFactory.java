package Ejercicio2;

/**
 *
 * @author Hansy Gonzalez
 * @author Marcell Granados
 */
public class CircleFactory implements FactoryInterface {

    @Override
    public Figure newFigure(Point c, int... num) {
        return new Circle(c, num[0]);
    }

}
