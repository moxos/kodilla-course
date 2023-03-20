package com.kodilla.good.patterns.Food2Door;

public class HealthyShop implements FoodProducer{
    @Override
    public boolean process() {
        System.out.println("Order from HealthyShop in progress... Order finished");
        return true;
    }
}
