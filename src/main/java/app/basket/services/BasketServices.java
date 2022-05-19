package app.basket.services;

import app.basket.model.Basket;
import app.product.model.Product;
import app.repository.basket.BasketRepository;
import app.services.GenerateUUId;

import app.user.model.Users;
import app.user.services.UserService;

import java.util.ArrayList;
import java.util.HashMap;

public class BasketServices {

    public static boolean addProductToBasketService(Product product, Double quantity, ArrayList<Users> users){
        // Take a current Users
        int idUser = 9876;
        Users usersCurrent = UserService.getCurrentUserFromArrayUsers(users, idUser);

        // The user no has session
        if(usersCurrent != null){
            int newIdBasket = GenerateUUId.generateUUId();

            HashMap<Integer, Double> products = new HashMap<>();
            // Llama r al repositorio psaandole el objet y guardarlo.
            products.put(product.getProductId(), quantity);
            BasketRepository.create(product);

            new Basket(newIdBasket, usersCurrent.getUserId(), products);
        }else{
            return false;
        }
        return true;
    }

    public static Basket loadFromUser(ArrayList<Users> users){
        int idUser = 9876;
        Basket basket;
        Users usersCurrent = UserService.getCurrentUserFromArrayUsers(users, idUser);
        if(usersCurrent == null){
            return null;
        }

        basket = usersCurrent.getBasket();

        if (basket == null){
            return null;
        }

        return basket;
    }

}
