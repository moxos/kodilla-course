package com.kodilla.good.patterns.challenges.orders;

public class Main {
    public static void main(String[] args) {
        OrderRequestRetriever orderRequestRetriever = new OrderRequestRetriever();
        OrderRequest orderRequest = orderRequestRetriever.request();
        OrderProcessor orderProcessor = new OrderProcessor(new Information(), new ProductOrderService(),
                new ProductOrderRepository());
        orderProcessor.process(orderRequest);
    }
}
