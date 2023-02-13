package com.kodilla;

import java.util.Random;

public class Computer {
    public String getRandom(){
        Random number = new Random();
        int min = 1;
        int max = 3;
        int randomNumber = number.nextInt(max + 1 - min)+min;
        String str = Integer.toString(randomNumber);
        System.out.println("Computer choice "+ str);
        return str;
    }

}
