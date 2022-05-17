package app.user.controller;

import app.basket.model.Basket;
import app.user.model.Users;

import java.util.ArrayList;

public class UserController {

    static ArrayList<Users> users = new ArrayList<>();

    public static ArrayList<Users> createFakeUsers() {
        Basket basket1 = new Basket();
        Users users1 = new Users(345, "Pepe", "Lopez",  basket1, "lopez@lopez.com", "1234" );

        Basket basket2 = new Basket();
        Users users2 = new Users(9876, "Jos", "Angular",  basket2, "jos@jos.com", "1234");

        users.add(users1);
        users.add(users2);

        return users;
    }
}
