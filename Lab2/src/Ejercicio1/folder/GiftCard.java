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
public class GiftCard extends AditionalConditionDecorator {

    private int discount;
    private String code;

    public GiftCard(ShippingElement shippingElement, int discount, String cardCode) {
        super(shippingElement);
        this.discount = discount;
        this.code = cardCode;
    }

    @Override
    public String toString() {
        return getAdditionalCondition().toString() + "\nTarjeta de regalo (Codigo de la tarjeta: " + code + ", descuento de " + discount + ")";
    }

    @Override
    public double getCost() {
        return getAdditionalCondition().getCost() - (getAdditionalCondition().getCost() * discount / 100);
    }

    public int getDiscount() {
        return discount;
    }

    public void setDiscount(int discount) {
        this.discount = discount;
    }

    public String getCardCode() {
        return code;
    }

    public void setCardCode(String cardCode) {
        this.code = cardCode;
    }
}
