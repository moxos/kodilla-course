package com.kodilla.testing.collection;

import java.util.ArrayList;
import java.util.List;

public class OddNumbersExterminator {

  private List<Integer> numbers;


    public OddNumbersExterminator(List<Integer> numbers) {
        this.numbers = numbers;
    }

    public List<Integer> exterminate(List<Integer> numbers){
        List<Integer> newList = new ArrayList<>();
        for(int number: numbers){
            if(number % 2 == 0){
                newList.add(number);
            }
        } return newList;
    }
}
