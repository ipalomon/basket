package app.view;

import app.product.model.Product;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Scanner;

public class IOView {
    public static void callMainMenu(){
        Scanner reader = new Scanner(System.in);

        while(true){
            Menu.mainMenu();
            int command = UtilitiesView.askInteger(reader, "Chose option?");
            if (command == 4) {
                break;
            } else if (command == 1) {
                //We create this feature to test our soft
                loopMenuProductList(reader);
            } else if (command == 2) {
                //call the loop view basket by user
                // TODO loopViewBasket
            } else if(command == 3){
                //call the view purchased by user
                System.out.println("Not implemented jet.");
            } else if(command == 0){
                // Test
            } else System.out.println("Unknown command");
        }
    }

    // Load the product list
    // Call de menu option for a product list: Add to basket or return to back menu
    public static void loopMenuProductList(Scanner reader){

        while (true){
            // Call the ViewController for load the fake data from ProductController
            HashMap<Integer,Product> products = ViewController.createFakeProducts();

            for(Product product: products.values()){
                System.out.println("Product Id: "+product.getProductId()+ " " + product.getName());
            }
            Menu.menuProductsList();
            int command = UtilitiesView.askInteger(reader, "Write option? Or type id for see the product detail");
            if(command == 0){
                break;
            }else{
                if(products.containsKey(command) ){
                    Product product = products.get(command);
                    loopProductDetail(reader, product);
                }
            }
        }
    }

    // Load de basket from user
    // Call the menu option for a basket: Delete or pay
    public static void loopViewBasket(Scanner reader){
        //TODO load basket from user
        Menu.menuBasket();
    }

    // Load product detail from de product list selected: Name, Description and  price
    public static void loopProductDetail(Scanner reader, Product product){
        // Call the ViewController for load the fake data from ProductController
        // TODO load product detail from product controller by fake data
        int productQuantity = 1;
        while (true){
            System.out.println("Id: " + product.getProductId());
            System.out.println("Name: " + product.getName());
            System.out.println("Description: " + product.getDescription());
            System.out.println("Price: " + product.getPrice());
            System.out.println("Amount: " + product.getProductTotalAmount());
            Menu.menuProductDetail();
            productQuantity = UtilitiesView.askInteger(reader, "Quantity?");
            if( productQuantity > 1){
                product.setProductTotalAmount(productQuantity * product.getPrice());
                System.out.println(" New amount: " + product.getProductTotalAmount());
            }else{
                if(productQuantity == 0 || productQuantity < 1){
                    System.out.println("Quantity match be greater than 0 ");
                }
            }
            int command = UtilitiesView.askInteger(reader, "Write option?");
            if(command == 1){
                break;
            }else{
                if(command == 0){
                    //TODO add Product to basket
                    System.out.println("Not implemented the add to basket");
                }
            }
        }

    }

    // Not implemented jet.
    public static void viewPurchased(){}
}
