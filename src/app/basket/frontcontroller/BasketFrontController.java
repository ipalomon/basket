package app.basket.frontcontroller;

import app.basket.controller.BasketController;
import app.product.model.Product;

import java.util.HashMap;

public class BasketFrontController {
    public static HashMap<String, String> addProductToBasket(Product product, Double quantity){
        return BasketController.addProductToBasket(product);
    }
}
