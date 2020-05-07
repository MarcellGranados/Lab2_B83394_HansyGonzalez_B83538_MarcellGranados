package Ejercicio2;

/**
 *
 * @author Hansy Gonzalez
 * @author Marcell Granados
 */
public class Rectangle {
    int high;
    int width;
    int x;                                  
    int y;

    public Rectangle() {
    }

    public Rectangle(int high, int width, int x, int y) {
        this.high = high;
        this.width = width;
        this.x = x;
        this.y = y;
    }

    public int getHigh() {return high;}
    public void setHigh(int high) {this.high = high;}
    public int getWidth() {return width;}
    public void setWidth(int width) {this.width = width;}
    public int getX() {return x;}
    public void setX(int x) {this.x = x;}
    public int getY() {return y;}
    public void setY(int y) {this.y = y;}

    @Override
    public String toString() {
        return "Rectangulo{" + "high=" + high + ", width=" + width + ", x=" + x + ", y=" + y + '}';
    }
    
}
