package com.kodilla.good.patterns.challenges.orders;

public class ProductOrderService implements OrderService{
    @Override
    public boolean order(OrderRequest orderRequest) {
        System.out.println("Starting order");
        return true;
    }
}
