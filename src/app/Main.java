package app;

import app.user.controller.UserController;
import app.user.model.User;
import app.view.IOView;

import java.util.HashMap;

public class Main {
    public static void main(String[] args){
        HashMap<int, User> user = UserController.createFakeUsers();
        //we are starting our software, we are booting it
        System.out.println("\nStarting BASKET, hello! " + user.get(9876).getName());

        //we are starting the main loop
        IOView.callMainMenu();
    }
}
