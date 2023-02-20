package com.kodilla.exception.test;



public class ExceptionHandling {
    public static void main(String[] args) {
        SecondChallenge secondChallenge = new SecondChallenge();

        try {
            secondChallenge.probablyIWillThrowException(1.0, 3.0);
        } catch (Exception e) {
            System.out.println("Oh no! Something went wrong! Error: " + e);
        } finally {
            System.out.println("I am gonna be here... always!");
        }
    }
}

