package Ejercicio2;

/**
 *
 * @author Hansy Gonzalez
 * @author Marcell Granados
 */
public class Main {

    public static void main(String[] args) throws PersonalizedException {
        CoordinatesFigures c1 = new MainBuilder().newCircle(new Coordinates(50, 60), 20);
        Circle c2 = (Circle) c1.copy();
        c2.setRadius(500);

        CoordinatesFigures r1 = new MainBuilder().newRectangle(new Coordinates(50, 60), 20, 30);

        System.out.println(c1.toString());
        System.out.println(c2.toString());
        System.out.println(r1.toString());
    }

}
