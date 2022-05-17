package main.java.app.user.model;


import main.java.app.basket.model.Basket;

public final class User {
    private int userId;
    private String name;
    private String surname;
    private Basket basket;

    public User() {
    }

    public User(int userId, String name, String surname, Basket basket) {
        this.userId = userId;
        this.name = name;
        this.surname = surname;
        this.basket = basket;
    }

    public String getName() {
        return name;
    }

    public String getSurname() {
        return surname;
    }

    public Basket getBasket() {
        return basket;
    }

    public int getUserId() {
        return userId;
    }

    public void setUserId(int userId) {
        this.userId = userId;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public void setBasket(Basket basket) {
        this.basket = basket;
    }

    @Override
    public String toString() {
        return "User{" +
                "userId=" + userId +
                ", name='" + name + '\'' +
                ", surname='" + surname + '\'' +
                ", basket=" + basket +
                '}';
    }
}
