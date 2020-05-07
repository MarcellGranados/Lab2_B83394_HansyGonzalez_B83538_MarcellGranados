import java.util.Iterator;
import java.util.TreeSet;
/**
 *
 * @author Hansy Gonzalez
 * @author Marcell Granados
 */
public class DeliveredPurchaseList {
    private final TreeSet<Purchase> purchasesList;

    public DeliveredPurchaseList() {
        purchasesList = new TreeSet <>();
    }
    
    public void addPurchase(Purchase purchase) { 
        purchasesList.add(purchase);
    }
    
    public String purchasesByStatusDate() { 
        String purchasesText = "";
        Iterator<Purchase> iterator = purchasesList.iterator();
        while(iterator.hasNext()) {
            purchasesText += iterator.next() + "\n\n";
        }        
        return purchasesText;
    }
}

