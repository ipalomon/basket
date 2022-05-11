package main.java.app.view;

import main.java.app.tests.ProductTest;
import main.java.app.user.model.User;

import java.util.ArrayList;
import java.util.Scanner;

public class IOView {
    public static void callMainMenu(ArrayList<User> users){
        Scanner reader = new Scanner(System.in);

        while(true){
            Menu.mainMenu();
            int command = app.view.UtilitiesView.askInteger(reader, "Chose option?");
            if (command == 5) {
                break;
            } else if (command == 2) {
                //We create this feature to test our soft
                ViewController.loopMenuProductList(reader, users);
            } else if (command == 3) {
                //call the loop view basket by user
                ViewController.loopViewBasket(reader, users);
            } else if(command == 4){
                //call the view purchased by user
                System.out.println("Not implemented jet.");
            } else if(command == 1){
                // Test
                ProductTest.productTest();
            } else System.out.println("Unknown command");
        }
    }
}
