package app.basket.model;

import java.util.ArrayList;
import java.util.HashMap;

import app.product.model.Product;

public class Basket {
    private int basketId;
    private int userId;
    // productId, productQuantity
    private HashMap<int, Double> productsListBasket;
    private Product product;

    public Basket() {
    }

    public Basket(int basketId, int userId, HashMap<int, Double> productsListBasket) {
        this.basketId = basketId;
        this.userId = userId;
        this.productsListBasket = new HashMap<int, Double>();
    }

    public int getBasketId() {
        return this.basketId;
    }

    public int getUserId() {
        return this.userId;
    }

    public void setBasketId(int basketId) {
        this.basketId = basketId;
    }

    public void setUserId(int userId) {
        this.userId = userId;
    }


    // TODO delete basket from user need the user id
    public void deleteProductFromBasket(Product product) {
        this.productsListBasket.remove(product);
    }

}
