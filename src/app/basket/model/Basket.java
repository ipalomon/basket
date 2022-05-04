package app.basket.model;

import java.util.HashMap;

import app.product.model.Product;

public class Basket {
    private int basketId;
    private int userId;
    // productId, productQuantity
    private HashMap<Product, Double> productsListBasket;

    public Basket() {
    }

    public Basket(int basketId, int userId, HashMap<Product, Double> productsListBasket) {
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

    public HashMap<Product, Double> getProductsListBasket() {
        return this.productsListBasket;
    }

    public void setBasketId(int basketId) {
        this.basketId = basketId;
    }

    public void setUserId(int userId) {
        this.userId = userId;
    }

    public void addProductToBasket(Product product, Double productQuantity) {
        this.productsListBasket.put(product, productQuantity);
    }

    // TODO delete basket from user need the user id
    public void deleteProductFromBasket(Product product) {
        this.productsListBasket.remove(product);
    }
    // TODO need the user id
    public void changeQuantityOfProduct(Product product, Double quantity) {
        this.productsListBasket.replace(product, quantity);
    }
}
