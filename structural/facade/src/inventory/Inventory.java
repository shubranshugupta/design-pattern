package inventory;

import product.Product;
import java.util.HashMap;

public class Inventory {
    private HashMap<Product, Integer> products;

    public void setProducts(HashMap<Product, Integer> products) {
        this.products = products;
    }

    public HashMap<Product, Integer> getProducts() {
        return products;
    }

    public void addProduct(int id, String name, double price, int quantity) {
        Product product = new Product(id, name, price);
        products.put(product, quantity);
    }

    public Product getProductWithId(int id) {
        for (Product product : products.keySet()) {
            if (product.getId() == id) {
                return product;
            }
        }
        return null;
    }

    public void removeProduct(int id) {
        Product product = getProductWithId(id);
        if (product != null) {
            products.remove(product);
        }
    }

    public void updateProductQuantity(int id, int quantity) {
        Product product = getProductWithId(id);
        if (product != null) {
            products.put(product, quantity);
        }
    }

    public boolean checkProductAvailability(int id, int quantity) {
        Product product = getProductWithId(id);
        if (product != null) {
            return products.get(product) >= quantity;
        }
        return false;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("============Inventory============\n");
        for (Product product : products.keySet()) {
            sb.append(product.toString()).append(", quantity: ").append(products.get(product)).append("\n");
        }
        return sb.toString();
    }
}
