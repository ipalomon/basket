package main.java.app.basket.services;

import app.services.GenerateUUId;

import main.java.app.Main;
import main.java.app.basket.model.Basket;
import main.java.app.product.model.Product;
import main.java.app.user.controller.UserController;
import main.java.app.user.model.User;
import main.java.app.user.services.UserService;

import java.util.ArrayList;
import java.util.HashMap;

public class BasketServices {

    public static boolean addProductToBasketService(Product product, Double quantity, ArrayList<User> users){
        // Take a current User
        int idUser = 9876;
        User userCurrent = UserService.getCurrentUserFromArrayUsers(users, idUser);

        // The user no has session
        if(userCurrent != null){
            int newIdBasket = GenerateUUId.generateUUId();

            HashMap<Integer, Double> products = new HashMap<>();
            products.put(product.getProductId(), quantity);

            new Basket(newIdBasket, userCurrent.getUserId(), products);
        }else{
            return false;
        }
        return true;
    }

    public static Basket loadFromUser(ArrayList<User> users){
        int idUser = 9876;
        Basket basket;
        User userCurrent = UserService.getCurrentUserFromArrayUsers(users, idUser);
        if(userCurrent == null){
            return null;
        }

        basket = userCurrent.getBasket();

        if (basket == null){
            return null;
        }

        return basket;
    }

}
