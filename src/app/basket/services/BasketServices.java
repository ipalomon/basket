package app.basket.services;

import app.basket.model.Basket;
import app.product.model.Product;
import app.services.GenerateUUId;
import app.user.controller.UserController;
import app.user.model.User;

import java.util.HashMap;

public class BasketServices {
    // Revisar que peta porque un usuario tiene un basket con varios productos y cada uno tiene una cantidad y un total y desopues esta el total a pagar
    public static boolean addProductToBasketService(Product product, Double quantity){
        HashMap<int, User> users = UserController.createFakeUsers();

        int newIdBasket = GenerateUUId.generateUUId();

        HashMap<int, Double> productQuantity = new HashMap<int, Double>();

        productQuantity.put(product.getProductId(), quantity);
        Basket basket = new Basket(newIdBasket, users.get(9876).getUserId(), productQuantity);

        addBasketToUser(users.get(9876).getUserId(), users, basket);

        return true;
    }

    public static void addBasketToUser(int userId, HashMap<int, User> users, Basket basket){
        users.get(userId).setBasket(basket);
    }
}
