package dao;

import java.util.HashMap;

import product.Product;

public interface DataDAO {
    public void saveData(HashMap<Product, Integer> products);

    public HashMap<Product, Integer> loadData();
}
