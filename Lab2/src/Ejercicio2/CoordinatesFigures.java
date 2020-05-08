package Ejercicio2;

/**
 *
 * @author Hansy Gonzalez
 * @author Marcell Granados
 */
public abstract class CoordinatesFigures implements Copyable {

    private Coordinates c;

    public CoordinatesFigures() {
    }

    public CoordinatesFigures(Coordinates c) {
        this.c = c;
    }

    public Coordinates getC() {
        return c;
    }

    public void setC(Coordinates c) {
        this.c = c;
    }

    @Override
    public String toString() {
        return c.toString();
    }

}
