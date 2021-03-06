package app.user.model;

import app.basket.model.Basket;

public final class Users {
    private int userId;
    private String name;
    private String surname;
    private Basket basket;
    private String username;
    private String password;


    public Users() {
    }

    public Users(String username, String password) {
        this.username = username;
        this.password = password;
    }

    public String getUsername() {
        return username;
    }

    public String getPassword() {
        return password;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public Users(int userId, String name, String surname, Basket basket, String username, String password) {
        this.userId = userId;
        this.name = name;
        this.surname = surname;
        this.basket = basket;
        this.username = username;
        this.password = password;
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
        return "Users{" +
                "userId=" + userId +
                ", name='" + name + '\'' +
                ", surname='" + surname + '\'' +
                ", basket=" + basket +
                '}';
    }
}
