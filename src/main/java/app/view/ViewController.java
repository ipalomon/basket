package app.view;

import app.user.model.Users;

import java.util.ArrayList;
import java.util.Scanner;

public class ViewController {

    // Load the product list
    // Call de menu option for a product list: Add to basket or return to back menu
    public static void loopMenuProductList(Scanner reader, ArrayList<Users> users){
        ViewService.loopMenuProductList(reader, users);
    }

    // Load de basket from users
    // Call the menu option for a basket: Delete or pay
    public static void loopViewBasket(Scanner reader, ArrayList<Users> users){
        ViewService.loopViewBasket(reader, users);
    }

    // Not implemented jet.
    public static void viewPurchased(){}
}
