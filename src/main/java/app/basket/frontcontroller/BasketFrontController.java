package app.basket.frontcontroller;


import app.basket.controller.BasketController;
import app.product.model.Product;
import app.user.model.Users;

import java.util.ArrayList;
import java.util.HashMap;

public class BasketFrontController {
    public static HashMap<String, String> addProductToBasket(Product product, Double quantity, ArrayList<Users> users){
        return BasketController.addProductToBasket(product, quantity, users);
    }

    public static HashMap<String, String> ViewProductToBasket(ArrayList<Users> users){
        return BasketController.viewProductToBasket(users);
    }
}
