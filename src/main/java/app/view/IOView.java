package main.java.app.view;

import main.java.app.tests.ProductTest;

import java.util.Scanner;

public class IOView {
    public static void callMainMenu(){
        Scanner reader = new Scanner(System.in);

        while(true){
            Menu.mainMenu();
            int command = app.view.UtilitiesView.askInteger(reader, "Chose option?");
            if (command == 4) {
                break;
            } else if (command == 1) {
                //We create this feature to test our soft
                ViewController.loopMenuProductList(reader);
            } else if (command == 2) {
                //call the loop view basket by user
                // TODO loopViewBasket
            } else if(command == 3){
                //call the view purchased by user
                System.out.println("Not implemented jet.");
            } else if(command == 0){
                // Test
                ProductTest.productTest();
            } else System.out.println("Unknown command");
        }
    }
}
