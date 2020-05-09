package Ejercicio2;

import java.util.ArrayList;
import java.util.Iterator;

/**
 *
 * @author Marcell Granados
 */
public class MixtedFigure {
    ArrayList<Figures> list = new ArrayList<>();

    public MixtedFigure() {
    }
    
    public MixtedFigure(ArrayList<Figures> list) {
        this.list = list;
    }
    
    public void addFigure(Figures figure){
        list.add(figure);
    }
    
    public void deleteFigure(Figures figure){
        list.remove(figure);
    }
    
    public Figures getFigure(int i){
        return (Figures)list.get(i).copy();
    }
    
    public String getInformation() {
        String figureInformation = "";
        Iterator<Figures> it = list.iterator();
        while (it.hasNext()) {
            figureInformation += "\n";
            figureInformation += it.next().toString();
        }
        return figureInformation;
    }
    
}
