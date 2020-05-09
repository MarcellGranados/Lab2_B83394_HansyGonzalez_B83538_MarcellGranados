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

        // PRUEBA FIGURA MIXTA
        CoordinatesFigures c3 = new MainBuilder().newCircle(new Coordinates(50, 60), 20);
        CoordinatesFigures c4 = new MainBuilder().newRectangle(new Coordinates(50, 60), 20, 30);
        CoordinatesFigures c5 = new MainBuilder().newCircle(new Coordinates(50, 70), 20);
        CoordinatesFigures c6 = new MainBuilder().newRectangle(new Coordinates(50, 70), 20, 30);

        MixtedFigure mf = new MixtedFigure();
        mf.addFigure(c3);
        mf.addFigure(c4);
        System.out.println("\nFigura Mixta 1:" + mf.getInformation());

        MixtedFigure mf2 = new MixtedFigure(mf.list);
        mf.addFigure(c5);
        mf.addFigure(c6);
        System.out.println("\nFigura Mixta 2:" + mf2.getInformation());
    }

}
