package com.kodilla.good.patterns.challenges.orders;

public class ProductOrderRepository implements OrderRepository{
    @Override
    public boolean createOrder(OrderRequest orderRequest, boolean isOrdered) {
        System.out.println("Thank you for the order");
        return true;
    }
}
