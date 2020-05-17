package Ejercicio1.folder;

import java.util.Comparator;
/**
 *
 * @author Hansy Gonzalez
 * @author Marcell Granados
 */
public class StatusComparator implements Comparator<Purchase>{

    @Override
    public int compare(Purchase purchase1, Purchase purchase2) {
        return purchase1.getStatus().getStatus().compareTo(purchase2.getStatus().getStatus());
    }
    
}
