package Ejercicio1.folder;

import java.util.logging.Level;
import java.util.logging.Logger;

/**
 * @author Marcell Granados
 * @author Hansy Gonzalez
 */
public class Main {

    public static void main(String[] args) {
        try {
            WarehouseStaff warehouseStaff = new WarehouseStaff();
            Client client1 = new Client("B89342", "mark.179@gmail.com");
            Purchase purchase1 = new Purchase();
            purchase1.addObservable(client1);
            purchase1.addObservable(warehouseStaff);
            purchase1.addProduct(new Product("6899", 2, 4));
            purchase1.addProduct(new Product("6688", 1, 6));
            purchase1.addProduct(new Product("6498", 2, 10));
            purchase1.addProduct(new Product("6409", 3, 12));
            purchase1.addProduct(new Product("6604", 1, 46));

            purchase1.removeProduct("6688");

            Client client2 = new Client("B88907", "es.em.115@gmail.com");
            Purchase purchase2 = new Purchase();
            purchase2.addObservable(client2);
            purchase2.addObservable(warehouseStaff);
            purchase2.addProduct(new Product("4366", 2, 8));
            purchase2.addProduct(new Product("1354", 1, 15));
            purchase2.addProduct(new Product("6498", 2, 12));
            purchase2.addProduct(new Product("9070", 5, 4));
            purchase2.addProduct(new Product("1411", 2, 22));

            purchase2.removeProduct("4366");

            Client client3 = new Client("B45678", "square.pants@gmail.com");
            Purchase purchase3 = new Purchase();
            purchase3.addObservable(client3);
            purchase3.addObservable(warehouseStaff);
            purchase3.addProduct(new Product("3566", 3, 14));
            purchase3.addProduct(new Product("2456", 2, 24));
            purchase3.addProduct(new Product("1986", 1, 28));
            purchase3.addProduct(new Product("B454", 3, 9));
            purchase3.addProduct(new Product("7086", 5, 2));

            purchase3.removeProduct("7086");

            Client client4 = new Client("B98375", "doge.meme@gmail.com");
            Purchase purchase4 = new Purchase();
            purchase4.addObservable(client4);
            purchase4.addObservable(warehouseStaff);
            purchase4.addProduct(new Product("2387", 1, 16));
            purchase4.addProduct(new Product("3904", 2, 12));
            purchase4.addProduct(new Product("4308", 3, 7));
            purchase4.addProduct(new Product("9830", 4, 9));
            purchase4.addProduct(new Product("3497", 5, 5));

            purchase4.removeProduct("3497");

            ProcessingPurchaseList processingPurchasesList = ProcessingPurchaseList.getINSTANCE();

            processingPurchasesList.addPurchase(purchase1);
            Thread.sleep(500);
            processingPurchasesList.addPurchase(purchase2);
            Thread.sleep(500);
            processingPurchasesList.addPurchase(purchase3);
            Thread.sleep(500);
            processingPurchasesList.addPurchase(purchase4);
            Thread.sleep(500);

            processingPurchasesList.updateStatus(1);
            Thread.sleep(200);
            processingPurchasesList.updateStatus(2);
            Thread.sleep(200);
            processingPurchasesList.updateStatus(3);
            Thread.sleep(200);
            processingPurchasesList.updateStatus(3);
            Thread.sleep(200);
            processingPurchasesList.updateStatus(4);
            Thread.sleep(200);
            processingPurchasesList.updateStatus(4);
            Thread.sleep(200);
            processingPurchasesList.updateStatus(4);
            Thread.sleep(200);

            ShippingElement decoratePurchase1 = new GiftCard(purchase1, 25, "6899");
            decoratePurchase1 = new FragileWrap(decoratePurchase1);
            decoratePurchase1 = new GiftWrapping(decoratePurchase1);

            System.out.println("\n" + purchase1);
            System.out.println("Compra 1 más decoraciones:\n" + decoratePurchase1.getCost());

            System.out.println("\n" + purchase2);
            purchase2.setShippingType(new ShippingByShip());
            System.out.println("\nCompra n°2 enviada por barco:\n" + purchase2.getCost());
            ShippingElement decoratePurchase2 = new FragileWrap(purchase2);
            System.out.println("Compra n°2 más envoltura para productos frágiles:\n" + decoratePurchase2.getCost());

            System.out.println("\n" + purchase3);
            System.out.println("Costo:\n" + purchase3.getCost());

            System.out.println("\n" + purchase4);
            System.out.println("Costo:\n" + purchase4.getCost());

        } catch (InterruptedException ex) {
            Logger.getLogger(Main.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

}
