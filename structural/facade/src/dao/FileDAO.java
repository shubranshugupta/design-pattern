package dao;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.util.HashMap;
import java.util.Scanner;

import product.Product;

public class FileDAO implements DataDAO {
    File file;

    public FileDAO(String fileName) {
        if (!fileName.endsWith(".csv"))
            throw new IllegalArgumentException("Invalid file type. Only .csv files are allowed.");
        file = new File(fileName);
    }

    public void saveData(HashMap<Product, Integer> products) {
        try (PrintWriter writer = new PrintWriter(this.file)) {
            for (Product product : products.keySet()) {
                StringBuilder sb = new StringBuilder();
                sb.append(product.getId()).append(",").append(product.getName()).append(",").append(product.getPrice())
                        .append(",").append(products.get(product));
                writer.println(sb.toString());
            }
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
    }

    public HashMap<Product, Integer> loadData() {
        try (Scanner scanner = new Scanner(this.file)) {
            HashMap<Product, Integer> products = new HashMap<>();
            while (scanner.hasNextLine()) {
                String line = scanner.nextLine();
                String[] parts = line.split(",");

                int id = Integer.parseInt(parts[0]);
                String name = parts[1];
                double price = Double.parseDouble(parts[2]);
                Product product = new Product(id, name, price);
                int quantity = Integer.parseInt(parts[3]);
                products.put(product, quantity);
            }

            return products;
        } catch (NumberFormatException e) {
            e.printStackTrace();
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }

        return null;
    }
}
