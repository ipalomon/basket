package main.java.app.basket.frontcontroller;


import main.java.app.basket.controller.BasketController;
import main.java.app.product.model.Product;

import java.util.HashMap;

public class BasketFrontController {
    public static HashMap<String, String> addProductToBasket(Product product, Double quantity){
        return BasketController.addProductToBasket(product, quantity);
    }
}
