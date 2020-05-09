package Ejercicio2;

import java.util.ArrayList;
import java.util.Iterator;

/**
 *
 * @author Marcell Granados
 */
public class MixtedFigure {
    ArrayList<CoordinatesFigures> list = new ArrayList<>();

    public MixtedFigure() {
    }
    
    public MixtedFigure(ArrayList<CoordinatesFigures> list) {
        this.list = list;
    }
    
    public void addFigure(CoordinatesFigures figure){
        list.add(figure);
    }
    
    public void deleteFigure(CoordinatesFigures figure){
        list.remove(figure);
    }
    
    public CoordinatesFigures getFigure(int i){
        return (CoordinatesFigures)list.get(i).copy();
    }
    
    public String getInformation() {
        String figureInformation = "";
        Iterator<CoordinatesFigures> it = list.iterator();
        while (it.hasNext()) {
            figureInformation += "\n";
            figureInformation += it.next().toString();
        }
        return figureInformation;
    }
    
}
