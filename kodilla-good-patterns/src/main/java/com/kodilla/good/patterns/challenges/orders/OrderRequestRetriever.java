package com.kodilla.good.patterns.challenges.orders;

public class OrderRequestRetriever {
    public OrderRequest request() {
        User user = new User("Bartek", "qwew123");
        Products products = new Products("Lion", 12);
        OrderSummary orderSummary = new OrderSummary("1", user, products.getPrice());
        OrderRequest orderRequest = new OrderRequest("1", orderSummary);
        return orderRequest;
    }
}
