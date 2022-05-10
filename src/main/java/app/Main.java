package main.java.app;


import main.java.app.user.controller.UserController;
import main.java.app.user.model.User;
import main.java.app.view.IOView;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args){
        ArrayList<User> user = UserController.createFakeUsers();
        //we are starting our software, we are booting it
        System.out.println("\nStarting BASKET, hello! " + user.get(1).getName());

        //we are starting the main loop
        IOView.callMainMenu();
    }
}
