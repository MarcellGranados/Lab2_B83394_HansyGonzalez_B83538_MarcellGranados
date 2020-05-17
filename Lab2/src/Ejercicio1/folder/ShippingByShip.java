/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Ejercicio1.folder;

/**
 * @author Marcell Granados
 * @author Hansy Gonzalez
 */
public class ShippingByShip implements ShippingStrategy {

    public ShippingByShip() {
    }

    @Override
    public double calculateShippingPrice(double kg) {
        return kg + kg * 15 / 100;
    }

    @Override
    public String toString() {
        return "Precio de entrega en barco: ";
    }
}
