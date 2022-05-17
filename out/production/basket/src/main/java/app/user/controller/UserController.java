package main.java.app.user.controller;



import main.java.app.basket.model.Basket;
import main.java.app.user.model.User;

import java.util.ArrayList;

public class UserController {

    static ArrayList<User> users = new ArrayList<>();

    public static ArrayList<User> createFakeUsers() {
        Basket basket1 = new Basket();
        User user1 = new User(345, "Pepe", "Lopez",  basket1);

        Basket basket2 = new Basket();
        User user2 = new User(9876, "Jos", "Angular",  basket2);

        users.add( user1);
        users.add( user2);

        return users;
    }
}
