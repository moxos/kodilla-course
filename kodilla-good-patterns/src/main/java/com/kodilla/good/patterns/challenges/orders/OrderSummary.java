package com.kodilla.good.patterns.challenges.orders;

public class OrderSummary {
    private String number;
    private User user;
    private long price;

    public String getNumber() {
        return number;
    }

    public User getUser() {
        return user;
    }

    public long getPrice() {
        return price;
    }

    public OrderSummary(String number, User user, long price) {

        this.number = number;
        this.user = user;
        this.price = price;
    }
}
