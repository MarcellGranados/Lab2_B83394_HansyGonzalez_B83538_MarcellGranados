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
public abstract class AditionalConditionDecorator implements ShippingElement {

    private final ShippingElement shippingElement;

    public AditionalConditionDecorator(ShippingElement shippingElement) {
        this.shippingElement = shippingElement;
    }

    public ShippingElement getAdditionalCondition() {
        return shippingElement;
    }
}
