package main.java.app.tests;

import main.java.app.product.model.Product;

import java.util.HashMap;

public class ProductTest {
    
    public static void productTest() {
        HashMap<Integer, Product> productsTest = new HashMap<>();

        createFakeProducts(productsTest);
    }

    public static void createFakeProducts(HashMap<Integer, Product> productsTest) {
        Product product1 = new Product(500, "vino", "vino blanco", 4.5);
        Product product2 = new Product(501, "vino", "vino tinto", 10);
        Product product3 = new Product(502, "pan", "pan integral", 0.5);

        productsTest.put(product1.getProductId(), product1);
        productsTest.put(product2.getProductId(), product2);
        productsTest.put(product3.getProductId(), product3);

        if (productsTest.size() == 3) {
            System.out.println("Test: createFakeProducts OK");
        } else {
            System.out.println("Test: createFakeProducts FAIL");
        }
    }
}
