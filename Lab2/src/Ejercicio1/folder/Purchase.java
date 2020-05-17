package Ejercicio1.folder;

import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.GregorianCalendar;
import java.util.Iterator;
import java.util.List;
import java.util.TreeMap;

/**
 *
 * @author Hansy Gonzalez
 * @author Marcell Granados
 */
public class Purchase implements Comparable<Purchase>, ShippingElement {

    private final List<Observer> observers;
    private int consecutive;
    private GregorianCalendar date;
    private Status status;
    private final TreeMap<String, Product> productsList;
    private ShippingStrategy shippingS;

    public Purchase() {
        productsList = new TreeMap<>();
        observers = new ArrayList<>();
        shippingS = new ShippingByPlane();
    }

    public int getConsecutive() {
        return consecutive;
    }

    public void setConsecutive(int consecutive) {
        this.consecutive = consecutive;
    }

    public GregorianCalendar getDate() {
        return date;
    }

    public void setDate(GregorianCalendar date) {
        this.date = date;
    }

    public Status getStatus() {
        return status;
    }

    public void setStatus(Status status) {
        this.status = status;
    }

    @Override
    public String toString() {
        String productsText = "";
        Iterator<Product> iterator = productsList.values().iterator();
        SimpleDateFormat dateFormat = new SimpleDateFormat("dd/MM/yy – hh:mm:ss:S");
        Product product;
        while (iterator.hasNext()) {
            product = iterator.next();
            productsText += product + ", peso total: " + product.calcGeneralWeight() + "\n";
        }

        return "Compra numero: " + consecutive + ", fecha: " + dateFormat.format(date.getTime()) + ", Estado: " + status.getStatus().getDescription() + "\nProductos:\n" + productsText + "Peso total: " + totalWeight();
    }

    public double totalWeight() {
        double totalWeight = 0;
        Iterator<Product> iterator = productsList.values().iterator();
        while (iterator.hasNext()) {
            totalWeight += iterator.next().calcGeneralWeight();
        }
        return totalWeight;
    }

    public void addProduct(Product product) {
        Product currentProduct;
        if (!productsList.containsKey(product.getCode())) {
            productsList.put(product.getCode(), product);
        } else {
            currentProduct = productsList.get(product.getCode());
            currentProduct.setQuantity(currentProduct.getQuantity() + product.getQuantity());
        }
    }

    public Product removeProduct(String code) {
        return productsList.remove(code);
    }

    public boolean updateStatus() {
        return status.updateStatus();
    }

    @Override
    public int compareTo(Purchase other) {
        return status.getDate().compareTo(other.status.getDate());
    }

    public ShippingStrategy getShippingType() {
        return shippingS;
    }

    public void setShippingType(ShippingStrategy shippingS) {
        this.shippingS = shippingS;
    }

    public double calculateShippingPrice() {
        return shippingS.calculateShippingPrice(totalWeight());
    }

    public void addObservable(Observer observer) {
        observers.add(observer);
    }

    public void removeObservable(Observer observer) {
        observers.remove(observer);
    }

    public void notifyObservers() {
        Iterator<Observer> iterator = observers.iterator();
        while (iterator.hasNext()) {
            iterator.next().update(status.getStatus(), consecutive);
        }
    }

    @Override
    public double getCost() {
        return shippingS.calculateShippingPrice(totalWeight());
    }

}
