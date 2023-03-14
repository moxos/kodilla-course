package com.kodilla.good.patterns.challenges.orders;

public class OrderRequest {

    private String number;
    private OrderSummary orderSummary;

    public OrderRequest(String number, OrderSummary orderSummary) {
        this.number = number;
        this.orderSummary = orderSummary;
    }

    public String getNumber() {
        return number;
    }

    public OrderSummary getOrderSummary() {
        return orderSummary;
    }
}
