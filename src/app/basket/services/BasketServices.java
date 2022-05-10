package app.basket.services;

import app.basket.model.Basket;
import app.product.model.Product;
import app.services.GenerateUUId;
import app.user.controller.UserController;
import app.user.model.User;
import app.user.services.UserService;

import java.util.ArrayList;
import java.util.HashMap;

public class BasketServices {

    public static boolean addProductToBasketService(Product product, Double quantity){
        ArrayList<User> users = UserController.createFakeUsers();
        // Take a current User
        int idUser = 9876;
        User userCurrent = UserService.getCurrentUserFromArrayUsers(users, idUser);

        // The user no has session
        if(userCurrent != null){
            int newIdBasket = GenerateUUId.generateUUId();

            HashMap<int, Double> products = new HashMap<int, Double>();
            products.put(product.getProductId(), quantity);

            Basket basket = new Basket(newIdBasket, userCurrent.getUserId(), products);

            addBasketToUser(userCurrent, basket);
        }else{
            return false;
        }
        return true;
    }

    public static void addBasketToUser(User user, Basket basket){
        user.setBasket(basket);
    }
}
