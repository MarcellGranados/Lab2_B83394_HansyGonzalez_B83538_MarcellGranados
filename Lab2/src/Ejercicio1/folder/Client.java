/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Ejercicio1.folder;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/**
 * @author Marcell Granados
 * @author Hansy Gonzalez
 */
public class Client implements Observer {

    private String id;
    private String email;
    private final List<StatusEnum> statusList;

    public Client(String id, String email) {
        this.id = id;
        this.email = email;
        statusList = new ArrayList<>();
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    @Override
    public void update(StatusEnum status, int consecutive) { 
        statusList.add(status);
    }

    @Override
    public String toString() {
        String text = "Cliente: " + id + ", email: " + email + "\nEstado de la compra:\n";
        Iterator<StatusEnum> iterator = statusList.iterator();
        if (iterator.hasNext()) {
            text += iterator.next() + "\n";
        }
        return text;
    }
}
