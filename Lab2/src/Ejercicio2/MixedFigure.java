package Ejercicio2;

import java.util.ArrayList;
import java.util.Iterator;

/**
 *
 * @author Hansy Gonzalez
 * @author Marcell Granados
 */
public class MixedFigure implements MuralComponent {

    ArrayList<MuralComponent> list;

    public MixedFigure() {
        list = new ArrayList<>();
    }

    public MixedFigure(ArrayList<MuralComponent> list) {
        this.list = list;
    }

    public void addFigure(MuralComponent figure) {
        list.add(figure);
    }

    public void deleteFigure(MuralComponent figure) {
        list.remove(figure);
    }

    public MuralComponent getFigure(int i) {
        return list.get(i);
    }

    @Override
    public String informationFigure() {
        String figureInformation = "";
        Iterator<MuralComponent> it = list.iterator();
        while (it.hasNext()) {
            figureInformation += "\n";
            figureInformation += it.next().toString();
        }
        return figureInformation;
    }

    @Override
    public MixedFigure copy() {
        ArrayList<MuralComponent> temp = new ArrayList<>();
        Iterator<MuralComponent> it = list.iterator();
        while (it.hasNext()) {
            temp.add((MuralComponent) it.next().copy());
        }
        return new MixedFigure(temp);
    }

}
