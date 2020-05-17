package Ejercicio1.folder;

import java.util.Iterator;
import java.util.TreeSet;

/**
 *
 * @author Hansy Gonzalez
 * @author Marcell Granados
 */
public class DeliveredPurchaseList {

    private final TreeSet<Purchase> purchasesList;
    private final static DeliveredPurchaseList LIST
            = new DeliveredPurchaseList();

    public DeliveredPurchaseList() {
        purchasesList = new TreeSet<>();
    }

    public void addPurchase(Purchase purchase) {
        purchasesList.add(purchase);
    }

    public String purchaseByStatusDate() {
        String purchasesText = "";
        Iterator<Purchase> iterator = purchasesList.iterator();
        while (iterator.hasNext()) {
            purchasesText += iterator.next() + "\n\n";
        }
        return purchasesText;
    }

    public static DeliveredPurchaseList getINSTANCE() {
        return LIST;
    }
}
