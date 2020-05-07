package Ejercicio2;

/**
 *
 * @author Marcell Granados
 */
public class CircleFactory implements CircleInterface{
    
    @Override
    public Circle newCircle(int radius, int x, int y) {
        if (x > 0 && y > 0 && radius > 0) {
            if (x+y - radius > 0) {
                return new Circle(radius, x, y);
            }
        }
        return null;
    }
}
