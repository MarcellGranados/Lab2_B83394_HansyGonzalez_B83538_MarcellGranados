/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Ejercicio1.folder;

import java.util.HashMap;
import java.util.Iterator;

/**
 * @author Marcell Granados
 * @author Hansy Gonzalez
 */
public class WarehouseStaff implements Observer {

    private final HashMap<Integer, StatusEnum> statusList = new HashMap<>();

    @Override
    public void update(StatusEnum status, int consecutive) {
        statusList.put(consecutive, status);
    }

    @Override
    public String toString() {
        String text = "Estado de compra:\n";
        Iterator<Integer> iterator = statusList.keySet().iterator();
        int consecutive;
        while (iterator.hasNext()) {
            consecutive = iterator.next();
            text += "Compra n°: " + consecutive + ", " + statusList.get(consecutive) + "\n";
        }
        return text;
    }
}
