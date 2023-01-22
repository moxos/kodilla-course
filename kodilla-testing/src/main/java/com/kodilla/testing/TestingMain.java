package com.kodilla.testing;
import com.kodilla.testing.calculator.Calculator;

public class TestingMain {
    public static void main(String[] args) {
        Calculator calculator = new Calculator();
        int resultAdd = calculator.add(15,7);
        int resultSubstract = calculator.substract(33, 11);

        System.out.println("Add test");
        if (resultAdd == 22){
            System.out.println("Correct");
        }else {
            System.out.println("Incorrect");
        }

        System.out.println("Substract test");

        if (resultSubstract == 22){
            System.out.println("Correct");
        }else{
            System.out.println("Incorrect");
        }

    }
}
