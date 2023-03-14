package com.kodilla.good.patterns.challenges.orders;

public interface OrderRepository {
    boolean createOrder(OrderRequest orderRequest, boolean isOrdered);
}
