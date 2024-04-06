package facade;

import dao.DataDAO;
import dao.FileDAO;
import inventory.Inventory;
import payment.Payment;
import product.Product;
import shipment.Shipping;

public class ECommerceFacade {
    private Inventory inventory;
    private DataDAO dataDAO;
    private Payment payment;
    private Shipping shipping;

    public ECommerceFacade(String dataPath) {
        dataDAO = new FileDAO(dataPath);
        inventory = new Inventory();
        inventory.setProducts(dataDAO.loadData());
        System.out.println(inventory);

        payment = new Payment();
        shipping = new Shipping();
    }

    public void buyProduct(int id, int quantity, String address, String contactNumber) {
        Product product = inventory.getProductWithId(id);
        if (inventory.checkProductAvailability(id, quantity)) {
            double totalPrice = product.getPrice() * quantity;
            payment.pay(totalPrice);
            shipping.ship(address, contactNumber);
            inventory.updateProductQuantity(id, inventory.getProducts().get(product) - quantity);
            dataDAO.saveData(inventory.getProducts());

        } else {
            System.out.println("Product not available");
        }

    }
}
