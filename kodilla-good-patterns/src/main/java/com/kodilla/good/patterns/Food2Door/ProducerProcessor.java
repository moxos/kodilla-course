package com.kodilla.good.patterns.Food2Door;

public class ProducerProcessor {

    void message() {
        System.out.println("Order started");
    }

    boolean producerProcess(String producentName){
        message();
        if(producentName == "HealthyShop"){
            return new HealthyShop().process();
        }else if(producentName == "GlutenFreeShop"){
            return new GlutenFreeShop().process();
        }else if(producentName == "ExtraFoodShop"){
            return new ExtraFoodShop().process();
        }else{
            System.out.println("Producent not listed");
            return false;
        }
    }
}
