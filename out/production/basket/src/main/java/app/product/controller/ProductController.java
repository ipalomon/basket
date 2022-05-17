package main.java.app.product.controller;


import main.java.app.product.model.Product;

import java.util.ArrayList;

public class ProductController {

    static ArrayList<Product> products = new ArrayList<Product>();

    public static ArrayList<Product> createFakeProducts() {
        Product product1 = new Product(456, "Car", "The blue car", 1200.45);
        Product product2 = new Product(932, "Bicycle", "The urban bicycle", 40.45);
        Product product3 = new Product(678, "Scooter", "The mountain scooter", 1200.45);
        Product product4 = new Product(550, "Boat", "The resistant coat boat", 99.45);

        products.add(product1);
        products.add(product2);
        products.add(product3);
        products.add(product4);
        return products;
    }
}
