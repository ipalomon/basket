package main.java.app.basket.controller;

import main.java.app.basket.model.Basket;
import main.java.app.basket.services.BasketServices;
import main.java.app.product.model.Product;
import main.java.app.user.model.User;

import java.util.ArrayList;
import java.util.HashMap;

public class BasketController {
    public static HashMap<String, String> addProductToBasket(Product product, Double quantity, ArrayList<User> users){
        HashMap<String, String> response = new HashMap<>();
        response.put("status", "error");
        response.put("code", "409");
        response.put("message", "Invalid structure");
        boolean addProduct = BasketServices.addProductToBasketService(product, quantity, users);

        if(addProduct){
            response.put("status", "OK");
            response.put("code", "200");
            response.put("message", "This product " + product.getProductId() + " Added to basket");
            response.put("product",product.toString());
        }
        return response;
    }

    public static HashMap<String, String> viewProductToBasket(ArrayList<User> user){
        HashMap<String, String> response = new HashMap<>();
        response.put("status", "error");
        response.put("code", "409");
        response.put("message", "Invalid structure");

        Basket basket = BasketServices.loadFromUser(user);

        if(basket != null){
            response.put("status", "OK");
            response.put("code", "200");
            response.put("message", "Your basket\n" + basket);
        }
        return response;
    }
}
