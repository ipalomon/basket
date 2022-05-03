package app.basket.model;

import java.util.HashMap;

public class Basket {
    private int basketId;
    private int userId;
    // productId, productQuantity
    private HashMap<Integer, Double> productsListBasket;

    public Basket(int basketId, int userId, HashMap<Integer, Double> productsListBasket) {
        this.basketId = basketId;
        this.userId = userId;
        this.productsListBasket = new HashMap<>();
    }

    public int getBasketId() {
        return this.basketId;   
    }

    public int getUserId() {
        return this.userId;
    }

    public HashMap<Integer, Double> getProductsListBasket() {
        return this.productsListBasket;
    }

    public void setBasketId(int basketId) {
        this.basketId = basketId;
    }

    public void setUserId(int userId) {
        this.userId = userId;
    }

    public void addProductToBasket(Integer productId, Double productQuantity) {
        this.productsListBasket.put(productId, productQuantity);
    }
}
