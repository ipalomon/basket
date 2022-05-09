package app.view;

import app.basket.frontcontroller.BasketFrontController;
import app.product.model.Product;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Scanner;

import static app.product.controller.ProductController.createFakeProducts;


public class ViewService {
    // Load product detail from de product list selected: Name, Description and  price
    public static void loopProductDetail(Scanner reader, Product product){
        // Call the ViewController for load the fake data from ProductController
        // load product detail from product controller by fake data
        String productQuantityStr = "1";
        Double productQuantity = 1.0;
        while (true){
            System.out.println("Id: " + product.getProductId());
            System.out.println("Name: " + product.getName());
            System.out.println("Description: " + product.getDescription());
            System.out.println("Price: " + product.getPrice());
            System.out.println("Amount: " + product.getProductTotalAmount());

            productQuantityStr = UtilitiesView.ask(reader, "Quantity? " + productQuantity);
            if(productQuantityStr.equals("")){
                productQuantity = 1.0;
            }
            if( productQuantity > 1.0){
                product.setProductTotalAmount(productQuantity * product.getPrice());
                System.out.println(" New amount: " + product.getProductTotalAmount());
            }else{
                if(productQuantity <= 0 ){
                    System.out.println("Quantity match be greater than 0 ");
                }
            }
            Menu.menuProductDetail();
            int command = UtilitiesView.askInteger(reader, "Chose 0 Add to basket or 1 return");
            if(command == 1){
                break;
            }else{
                if(command == 0){
                    //TODO add Product to basket
                    HashMap<String, String> response = BasketFrontController.addProductToBasket(product, productQuantity);
                }
            }
        }

    }

    // Load the product list
    // Call de menu option for a product list: Add to basket or return to back menu
    public static void loopMenuProductList(Scanner reader){

        while (true){
            // Call the ViewController for load the fake data from ProductController
            ArrayList<Product> products = createFakeProducts();
            for(Product product: products){
                System.out.println("Product Id: "+product.getProductId()+ " " + product.getName());
            }
            Menu.menuProductsList();
            int command = UtilitiesView.askInteger(reader, "Write option? Or type id for see the product detail");
            if(command == 0){
                break;
            }else{
                for(Product product: products){
                    // for each product search de id if it is found show product detail
                    if(product.getProductId() == command ){
                        loopProductDetail(reader, product);
                        break;
                    }
                }
            }
        }
    }
}
