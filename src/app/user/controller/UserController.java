package app.user.controller;

import app.basket.model.Basket;
import app.user.model.User;

import java.util.ArrayList;

public class UserController {
    static ArrayList<User> users = new ArrayList<>();

    public static void createFakeUsers() {
        Basket basket1 = new Basket();
        User user1 = new User(1, "Pepe", "Lopez",  basket1);

        Basket basket2 = new Basket();
        User user2 = new User(1, "José", "Agular",  basket2);

        users.add(user1);
        users.add(user2);
    }
}
