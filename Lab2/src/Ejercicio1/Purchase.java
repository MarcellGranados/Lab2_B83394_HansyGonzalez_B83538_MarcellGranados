import java.text.SimpleDateFormat;
import java.util.GregorianCalendar;
import java.util.Iterator;
import java.util.TreeMap;

/**
 *
 * @author Hansy Gonzalez
 * @author Marcell Granados
 */
public class Purchase implements Comparable<Purchase>{
    private int consecutive;
    private GregorianCalendar date;
    private Status status;
    private final TreeMap<String, Product> productsList;

    public Purchase() {
        productsList = new TreeMap<>();
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
        while(iterator.hasNext()) {
            product = iterator.next();
            productsText += product + ", peso total: " + product.calcGeneralWeight() + "\n";
        }
        
        return "Compra numero: " + consecutive + ", fecha: " + dateFormat.format(date.getTime()) + ", Estado: " + status.getStatus().getDescription() + "\nProductos:\n" + productsText + "Peso total: " + totalWeight();
    }
    
    public double totalWeight() {
        double totalWeight = 0;
        Iterator<Product> iterator = productsList.values().iterator();
        while(iterator.hasNext()) {
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
    
}
