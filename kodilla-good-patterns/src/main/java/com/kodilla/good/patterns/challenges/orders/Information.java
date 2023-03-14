package com.kodilla.good.patterns.challenges.orders;

public class Information implements InformationService{
    @Override
    public void information(User user) {
        System.out.println("New order for "+ user.getName());
    }
}
