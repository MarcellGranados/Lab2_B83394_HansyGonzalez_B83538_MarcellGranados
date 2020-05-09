package Ejercicio2;

/**
 *
 * @author Hansy Gonzalez
 * @author Marcell Granados
 */
public abstract class Figures implements Copyable {

    private Coordinates coordinates;

    public Figures() {
    }

    public Figures(Coordinates coordinates) {
        this.coordinates = coordinates;
    }

    public Coordinates getCoordinates() {
        return coordinates;
    }

    public void setCoordinates(Coordinates c) {
        this.coordinates = c;
    }

    @Override
    public String toString() {
        return coordinates.toString();
    }

}
