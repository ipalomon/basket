package app.basket.model;

import java.util.HashMap;

import app.product.model.ProductModel;

public class Basket {
    private int basketId;
    private int userId;
    // product, productQuantity
    private HashMap<ProductModel, Double> productsListBasket;

    public Basket(int basketId, int userId, HashMap<ProductModel, Double> productsListBasket) {
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

    public HashMap<ProductModel, Double> getProductsListBasket() {
        return this.productsListBasket;
    }

    public void setBasketId(int basketId) {
        this.basketId = basketId;
    }

    public void setUserId(int userId) {
        this.userId = userId;
    }

    public void addProductToBasket(ProductModel product, Double productQuantity) {
        this.productsListBasket.put(product, productQuantity);
    }
}
