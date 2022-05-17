package app;

import app.user.controller.UserController;
import app.user.model.Users;
import app.view.IOView;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args){
        ArrayList<Users> users = UserController.createFakeUsers();
        //we are starting our software, we are booting it
        System.out.println("\nStarting BASKET, hello! " + users.get(1).getName());

        //we are starting the main loop
        IOView.callMainMenu(users);
    }
}
