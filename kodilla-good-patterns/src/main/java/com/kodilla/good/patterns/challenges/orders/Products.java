package com.kodilla.good.patterns.challenges.orders;

public class Products {
    private String name;
    private long price;

    public Products(String name, long price) {
        this.name = name;
        this.price = price;
    }

    public String getName() {
        return name;
    }

    public long getPrice() {
        return price;
    }
}
