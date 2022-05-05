package app.view;

import app.product.controller.ProductController;
import app.product.model.Product;

import java.util.HashMap;
import java.util.Scanner;

public class ViewController {

    // Load the product list
    // Call de menu option for a product list: Add to basket or return to back menu
    public static void loopMenuProductList(Scanner reader){
        ViewService.loopMenuProductList(reader);
    }

    // Load de basket from user
    // Call the menu option for a basket: Delete or pay
    public static void loopViewBasket(Scanner reader){
        //TODO load basket from user
        Menu.menuBasket();
    }



    // Not implemented jet.
    public static void viewPurchased(){}
}
