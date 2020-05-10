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
        
        
        Figure circle1 = circleFactory.newFigure(new Point(50, 60), 20);
        Circle circle2 = (Circle) circle1.copy();
        circle2.setRadius(500);
        
        Figure rectangle1 = rectangleFactory.newFigure(new Point(50, 60), 20, 30);
        Rectangle rectangle2 = (Rectangle) rectangle1.copy();
        rectangle2.setHigh(30);
        rectangle2.setWidth(10);
        rectangle2.setPoint(new Point(60, 70));

        System.out.println(circle1.toString());
        System.out.println(circle2.toString());
        System.out.println(rectangle1.toString());
        System.out.println(rectangle2.toString());

        // PRUEBA FIGURA MIXTA
        Figure circle3 = circleFactory.newFigure(new Point(50, 60), 20);
        Figure circle4 = circleFactory.newFigure(new Point(50, 70), 20);
        Figure rectangle3 = rectangleFactory.newFigure(new Point(50, 60), 20, 30);
        Figure rectangle4 = rectangleFactory.newFigure(new Point(50, 70), 20, 30);

        MixedFigure mf = new MixedFigure();
        mf.addFigure(circle3);
        mf.addFigure(rectangle3);
        System.out.println("\nFigura Mixta 1:" + mf.informationFigure());

        MixedFigure mf2 = mf.copy();
        mf2.addFigure(circle4);
        mf2.addFigure(rectangle4);
        System.out.println("\nFigura Mixta 2:" + mf2.informationFigure());
        
    }

}
