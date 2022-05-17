package main.java.app.basket.frontcontroller;


import main.java.app.basket.controller.BasketController;
import main.java.app.product.model.Product;
import main.java.app.user.model.User;

import java.util.ArrayList;
import java.util.HashMap;

public class BasketFrontController {
    public static HashMap<String, String> addProductToBasket(Product product, Double quantity, ArrayList<User> users){
        return BasketController.addProductToBasket(product, quantity, users);
    }

    public static HashMap<String, String> ViewProductToBasket(ArrayList<User> user){
        return BasketController.viewProductToBasket(user);
    }
}
