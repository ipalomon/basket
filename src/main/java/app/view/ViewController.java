package main.java.app.view;

import main.java.app.user.model.User;
import main.java.app.view.ViewService;

import java.util.ArrayList;
import java.util.Scanner;

public class ViewController {

    // Load the product list
    // Call de menu option for a product list: Add to basket or return to back menu
    public static void loopMenuProductList(Scanner reader, ArrayList<User> users){
        ViewService.loopMenuProductList(reader, users);
    }

    // Load de basket from user
    // Call the menu option for a basket: Delete or pay
    public static void loopViewBasket(Scanner reader, ArrayList<User> user){
        ViewService.loopViewBasket(reader, user);
    }

    // Not implemented jet.
    public static void viewPurchased(){}
}
