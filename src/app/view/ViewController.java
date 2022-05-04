package app.view;

import app.product.controller.ProductController;
import app.product.model.Product;

import java.util.ArrayList;

public class ViewController {
    public static ArrayList<Product> createFakeProducts(){
        ArrayList<Product> products = ProductController.createFakeProducts();
        return products;
    }
}
