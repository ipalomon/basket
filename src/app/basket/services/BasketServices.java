package app.basket.services;

import app.basket.model.Basket;
import app.product.model.Product;
import app.services.GenerateUUId;
import app.user.controller.UserController;
import app.user.model.User;
import app.user.services.UserService;

import java.util.ArrayList;

public class BasketServices {

    public static boolean addProductToBasketService(Product product){
        ArrayList<User> users = UserController.createFakeUsers();
        int idUser = 9876;
        User userCurrent = UserService.getCurrentUserFromArrayUsers(users, idUser);

        // The user no has session
        if(userCurrent != null){
            int newIdBasket = GenerateUUId.generateUUId();

            ArrayList<Product> products = new ArrayList<>();
            products.add(product);

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
