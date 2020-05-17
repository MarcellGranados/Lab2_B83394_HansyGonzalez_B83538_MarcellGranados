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
public class FragileWrap extends AditionalConditionDecorator {

    public FragileWrap(ShippingElement shippingElement) {
        super(shippingElement);
    }

    @Override
    public String toString() {
        return getAdditionalCondition().toString() + "\nPorcentaje extra por envoltura: 1%";
    }

    @Override
    public double getCost() {
        return getAdditionalCondition().getCost() + (getAdditionalCondition().getCost() * 1 / 100);
    }

}
