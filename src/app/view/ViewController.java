package app.view;

import app.product.controller.ProductController;
import app.product.model.Product;

import java.util.HashMap;

public class ViewController {
    public static HashMap<Integer,Product> createFakeProducts(){
        HashMap<Integer,Product> products = ProductController.createFakeProducts();
        return products;
    }
}
