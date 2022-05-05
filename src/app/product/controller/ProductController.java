package app.product.controller;

import app.product.model.Product;

import java.util.ArrayList;
import java.util.HashMap;

public class ProductController {
    static HashMap<Integer,Product> products = new HashMap<>();

    public static HashMap<Integer,Product> createFakeProducts() {
        Product product1 = new Product(456, "Car", "The blue car", 1200.45);
        Product product2 = new Product(932, "Bicycle", "The urban bicycle", 40.45);
        Product product3 = new Product(678, "Scooter", "The mountain scooter", 1200.45);
        Product product4 = new Product(550, "Boat", "The resistant coat boat", 1200.45);

        products.put(product1.getProductId(),product1);
        products.put(product2.getProductId(),product2);
        products.put(product3.getProductId(),product3);
        products.put(product4.getProductId(),product4);
        return products;
    }
}
