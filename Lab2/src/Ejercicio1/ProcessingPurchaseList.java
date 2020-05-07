import java.util.ArrayList;
import java.util.Collections;
import java.util.GregorianCalendar;
import java.util.Iterator;
import java.util.List;
import java.util.TreeMap;

/**
 *
 * @author Hansy Gonzalez
 * @author Marcell Granados
 */
public class ProcessingPurchaseList {
    private final TreeMap <Integer, Purchase> purchasesList;
    private static int consecutive;

    public ProcessingPurchaseList() {
        purchasesList = new TreeMap<>();
        consecutive = 1;
    }
    
    public void addPurchase(Purchase purchase) { 
        if (!purchasesList.containsKey(purchase.getConsecutive())) {
            GregorianCalendar date = new GregorianCalendar();
            purchase.setDate(date);
            purchase.setConsecutive(consecutive++);
            purchase.setStatus(new Status(date));
            purchasesList.put(purchase.getConsecutive(), purchase);
        }
    }
    
    public void updateStatus(int consecutive) {
        if (!purchasesList.get(consecutive).updateStatus()) {
            Main.deliveredPurchaseList.addPurchase(purchasesList.remove(consecutive));
        }
    }
    
    public String purchaseByCode() {
        String purchasesText = "";
        Iterator<Purchase> iterator = purchasesList.values().iterator();
        while(iterator.hasNext()) {
            purchasesText += iterator.next() + "\n\n";
        }        
        return purchasesText;
    }
    
    public String purchaseByStatus() {
        String purchasesText = "";
        List<Purchase> purchasesByStatusList = new ArrayList<>(purchasesList.values());
        Collections.sort(purchasesByStatusList, new StatusComparator());
        Iterator<Purchase> iterator = purchasesByStatusList.iterator();
        while(iterator.hasNext()) {
            purchasesText += iterator.next() + "\n\n";
        }        
        return purchasesText;
    }
}
