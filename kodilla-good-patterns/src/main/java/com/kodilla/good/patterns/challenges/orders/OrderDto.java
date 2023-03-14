package com.kodilla.good.patterns.challenges.orders;

public class OrderDto {
    private OrderRequest orderRequest;
    private boolean isOrdered;
    public OrderDto(OrderRequest orderRequest, boolean isOrdered) {
        this.orderRequest = orderRequest;
        this.isOrdered = isOrdered;
    }
}
