package app.user.controller;

import app.basket.model.Basket;
import app.product.model.Product;
import app.user.model.User;

import java.util.ArrayList;
import java.util.HashMap;

public class UserController {
    static HashMap<int, User> users = new HashMap<int, User>();

    public static HashMap<int, User> createFakeUsers() {
        Basket basket1 = new Basket();
        User user1 = new User(345, "Pepe", "Lopez",  basket1);

        Basket basket2 = new Basket();
        User user2 = new User(9876, "Jos", "Angular",  basket2);

        users.put(user1.getUserId(), user1);
        users.put(user2.getUserId(), user2);

        return users;
    }
}
