package app.user.services;


import app.user.model.User;

import java.util.ArrayList;

public class UserService {
    public static User getCurrentUserFromArrayUsers(ArrayList<User> users, int idUser){
        for(User user: users){
            if(user.getUserId() == idUser){
                return user;
            }
        }
        return null;
    }
}
