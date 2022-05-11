package main.java.app.view;

import main.java.app.basket.frontcontroller.BasketFrontController;
import main.java.app.product.model.Product;
import main.java.app.user.model.User;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Scanner;

import static main.java.app.product.controller.ProductController.createFakeProducts;


public class ViewService {
    // Load product detail from de product list selected: Name, Description and  price
    public static void loopProductDetail(Scanner reader, Product product, ArrayList<User> users){
        // Call the ViewController for load the fake data from ProductController
        // load product detail from product controller by fake data
        String productQuantityStr = "1";
        double productQuantity = 1.0;
        double amount = 0;
        while (true){
            System.out.println("Id: " + product.getProductId());
            System.out.println("Name: " + product.getName());
            System.out.println("Description: " + product.getDescription());
            System.out.println("Price: " + product.getPrice());

            productQuantityStr = app.view.UtilitiesView.ask(reader, "Quantity? " + productQuantity);
            if(productQuantityStr.equals("")){
                productQuantity = 1.0;
            }else{
                productQuantity = Double.parseDouble(productQuantityStr);
                amount = productQuantity * product.getPrice();
                System.out.println(" New amount: " + amount);
            }

            if(productQuantity <= 0 ){
                System.out.println("Quantity match be greater than 0 ");
            }

            Menu.menuProductDetail();
            int command = app.view.UtilitiesView.askInteger(reader, "Chose 0 Add to basket or 1 return");
            if(command == 1){
                break;
            }else{
                if(command == 0){
                    HashMap<String, String> response = BasketFrontController.addProductToBasket(product, productQuantity, users);
                    for (String responses :response.values()) {
                        System.out.println(responses);
                    }
                }
            }
        }

    }

    // Load the product list
    // Call de menu option for a product list: Add to basket or return to back menu
    public static void loopMenuProductList(Scanner reader, ArrayList<User> users){

        while (true){
            // Call the ViewController for load the fake data from ProductController
            ArrayList<Product> products = createFakeProducts();
            for(Product product: products){
                System.out.println("Product Id: "+product.getProductId()+ " " + product.getName());
            }
            Menu.menuProductsList();
            int command = app.view.UtilitiesView.askInteger(reader, "Write option? Or type id for see the product detail");
            if(command == 1){
                break;
            }else{
                for(Product product: products){
                    // for each product search de id if it is found show product detail
                    if(product.getProductId() == command ){
                        loopProductDetail(reader, product, users);
                        break;
                    }
                }
            }
        }
    }

    public static void loopViewBasket(Scanner reader, ArrayList<User> user){
        while(true){
            HashMap<String, String> response = BasketFrontController.ViewProductToBasket(user);
            System.out.println(response);
            Menu.menuBasket();
            int command = app.view.UtilitiesView.askInteger(reader, "Write option?");

            if(command == 3){
                break;
            }else{
                if(command == 1){
                    // Delete
                }else{
                    if(command == 2){
                        //Pay
                    }
                }
            }
        }
    }
}
