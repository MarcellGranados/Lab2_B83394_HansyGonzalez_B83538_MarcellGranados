/**
 *
 * @author Hansy Gonzalez
 * @author Marcell Granados
 */
public class Product {
    private String code;
    private int quantity;
    private double weight;

    public Product() {
    }

    public Product(String code, int quantity, double weight) {
        this.code = code;
        this.quantity = quantity;
        this.weight = weight;
    }

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }

    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }

    public double getWeight() {
        return weight;
    }

    public void setWeight(double weight) {
        this.weight = weight;
    }

    @Override
    public String toString() {
        return "Producto (" + "codigo: " + code + ", cantidad: " + quantity + ", peso unitario: " + weight + ')';
    }
    
    public double calcGeneralWeight(){
        return quantity*weight;
    }
}