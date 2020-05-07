package Ejercicio2;

/**
 *
 * @author Hansy Gonzalez
 * @author Marcell Granados
 */
public class Circle {
    int radius;
    int x;
    int y;

    public Circle() {
    }

    public Circle(int radius, int x, int y) {
        this.radius = radius;
        this.x = x;
        this.y = y;
    }

    public int getRadius() {return radius;}
    public void setRadius(int radius) {this.radius = radius;}
    public int getX() {return x;}
    public void setX(int x) {this.x = x;}
    public int getY() {return y;}
    public void setY(int y) {this.y = y;}

    @Override
    public String toString() {
        return "Circle{" + "radius=" + radius + ", x=" + x + ", y=" + y + '}';
    }
    
}
