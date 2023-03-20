package com.kodilla.good.patterns.Food2Door;

public class GlutenFreeShop implements FoodProducer{
    @Override
    public boolean process() {
        System.out.println("Order from GlutenFreeShop in progress... Order finished");
        return true;
    }
}
