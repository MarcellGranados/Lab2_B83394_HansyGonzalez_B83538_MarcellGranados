
/**
 *
 * @author Hansy Gonzalez
 * @author Marcell Granados
 */
public class Main {

    public static DeliveredPurchaseList deliveredPurchaseList = new DeliveredPurchaseList();
    public static ProcessingPurchaseList processingPurchaseList = new ProcessingPurchaseList();

    public static void main(String[] args) {
        
        try {
            Purchase purchase1 = new Purchase();
            Purchase purchase2 = new Purchase();
            Purchase purchase3 = new Purchase();
            Purchase purchase4 = new Purchase();

            purchase1.addProduct(new Product("GC18", 1, 7.4));
            purchase1.addProduct(new Product("GC23", 1, 12.4));
            purchase1.addProduct(new Product("MV14", 2, 10.1));
            purchase1.addProduct(new Product("GS15", 2, 7.9));

            purchase2.addProduct(new Product("XP50", 4, 22.5));
            purchase2.addProduct(new Product("BT86", 1, 30.2));
            purchase2.addProduct(new Product("XP32", 1, 29.7));
            purchase2.addProduct(new Product("TH13", 2, 10.5));

            purchase3.addProduct(new Product("OP89", 3, 3.6));
            purchase3.addProduct(new Product("DR70", 1, 14.9));
            purchase3.addProduct(new Product("ET89", 1, 12.8));
            purchase3.addProduct(new Product("ZS69", 1, 9.4));

            purchase4.addProduct(new Product("RB20", 2, 13.8));
            purchase4.addProduct(new Product("GB90", 3, 6.4));
            purchase4.addProduct(new Product("BV67", 1, 8.5));
            purchase4.addProduct(new Product("PL89", 1, 13.7));

            processingPurchaseList.addPurchase(purchase1);
            processingPurchaseList.addPurchase(purchase2);
            processingPurchaseList.addPurchase(purchase3);
            processingPurchaseList.addPurchase(purchase4);
            
            //purchase1.removeProduct("MV14");

            System.out.println("Lista de Compras \n" + processingPurchaseList.purchaseByStatus());
            
            processingPurchaseList.updateStatus(1);
            processingPurchaseList.updateStatus(2);
            processingPurchaseList.updateStatus(3);
            processingPurchaseList.updateStatus(4);
            
            System.out.println(".....................................");
            Thread.sleep(200);

            System.out.println("Lista de Compras \n" + processingPurchaseList.purchaseByStatus());
            
            processingPurchaseList.updateStatus(1);
            processingPurchaseList.updateStatus(2);
            processingPurchaseList.updateStatus(3);
            processingPurchaseList.updateStatus(4);
            
            System.out.println(".....................................");
            Thread.sleep(200);

            System.out.println("Lista de Compras \n" + processingPurchaseList.purchaseByStatus());
            
            processingPurchaseList.updateStatus(1);
            processingPurchaseList.updateStatus(2);
            processingPurchaseList.updateStatus(3);
            processingPurchaseList.updateStatus(4);
            
            System.out.println(".....................................");
            Thread.sleep(200);

            System.out.println("Lista de Compras \n" + processingPurchaseList.purchaseByStatus());
            
            processingPurchaseList.updateStatus(1);
            processingPurchaseList.updateStatus(2);
            processingPurchaseList.updateStatus(3);
            processingPurchaseList.updateStatus(4);
            
            System.out.println(".....................................");
            Thread.sleep(200);

            System.out.println("Lista de Compras ya entregadas\n" + deliveredPurchaseList.purchasesByStatusDate());
            
            processingPurchaseList.updateStatus(1);
            processingPurchaseList.updateStatus(2);
            processingPurchaseList.updateStatus(3);
            processingPurchaseList.updateStatus(4);

            System.out.println(".....................................");
            Thread.sleep(200);

        } catch (InterruptedException e) {
            System.out.println(e.getMessage());
        } catch (NullPointerException e){
            System.out.println(e.getCause());
        }

    }

}
