package main.java.app.view;

public class Menu {
    public static void mainMenu(){
        System.out.println("Main menu");
        System.out.println("0-Test");
        System.out.println("1-Product list");
        System.out.println("2-View basket");
        System.out.println("3-Purchased.");
        System.out.println("4-Quit.");
    }

    // Load products lis from the product controller
    public static void menuProductsList(){
        System.out.println("Product list");
        //TODO load products from de product controller by fake products
        System.out.println("0-Return.");
    }


    public static void menuProductDetail(){
        System.out.println("Product detail");
        System.out.println("0-Add to basket.");
        System.out.println("1-Return.");
    }

    public static void menuBasket(){
        System.out.println("Your basket");
        System.out.println("1-Delete.");
        System.out.println("2-Pay.");
        System.out.println("3-Return.");
    }
}
