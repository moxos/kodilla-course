package com.kodilla.good.patterns.Food2Door;

public class ExtraFoodShop implements FoodProducer {
    @Override
    public boolean process() {
        System.out.println("Order from ExtraFoodShop in progress... Order finished");
        return true;
    }
}
