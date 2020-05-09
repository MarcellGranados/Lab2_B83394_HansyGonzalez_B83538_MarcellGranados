package Ejercicio2;

/**
 *
 * @author Hansy Gonzalez
 * @author Marcell Granados
 */
public class Main {

    public static void main(String[] args) throws PersonalizedException {
        FactoryInterface rectangleFactory = new RectangleFactory();
        FactoryInterface circleFactory = new CircleFactory();
        
        Figures circle1 = circleFactory.newFigure(new Coordinates(50, 60), 20);
        Circle circle2 = (Circle) circle1.copy();
        circle2.setRadius(500);
        
        Figures rectangle1 = rectangleFactory.newFigure(new Coordinates(50, 60), 20, 30);

        System.out.println(circle1.toString());
        System.out.println(circle2.toString());
        System.out.println(rectangle1.toString());

        // PRUEBA FIGURA MIXTA
        Figures circle3 = circleFactory.newFigure(new Coordinates(50, 60), 20);
        Figures rectangle2 = rectangleFactory.newFigure(new Coordinates(50, 60), 20, 30);
        Figures circle4 = circleFactory.newFigure(new Coordinates(50, 70), 20);
        Figures rectangle3 = rectangleFactory.newFigure(new Coordinates(50, 70), 20, 30);

        MixtedFigure mf = new MixtedFigure();
        mf.addFigure(circle3);
        mf.addFigure(rectangle2);
        System.out.println("\nFigura Mixta 1:" + mf.getInformation());

        MixtedFigure mf2 = new MixtedFigure(mf.list);
        mf.addFigure(circle4);
        mf.addFigure(rectangle3);
        System.out.println("\nFigura Mixta 2:" + mf2.getInformation());
    }

}
