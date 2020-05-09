package Ejercicio2;

/**
 *
 * @author Hansy Gonzalez
 * @author Marcell Granados
 */
public class Coordinates implements Copyable {

    int x;
    int y;

    public Coordinates() {
    }

    public Coordinates(int x, int y) {
        this.x = x;
        this.y = y;
    }

    public int getX() {
        return x;
    }

    public void setX(int x) {
        this.x = x;
    }

    public int getY() {
        return y;
    }

    public void setY(int y) {
        this.y = y;
    }

    @Override
    public String toString() {
        return " Coordinadas{" + "x=" + x + ", y=" + y + '}';
    }

    @Override
    public Copyable copy() {
        return new Coordinates(x, y);
    }
}
