package app.user.services;


import app.user.model.Users;

import java.util.ArrayList;

public class UserService {
    public static Users getCurrentUserFromArrayUsers(ArrayList<Users> users, int idUser){
        for(Users user: users){
            if(user.getUserId() == idUser){
                return user;
            }
        }
        return null;
    }
}
