package com.kodilla.stream.array;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class ArrayOperationsTestSuite {

    @Test
    public void testGetAverage() {

        int [] numbers = new int[20];
        for(int i =0; i <20; i++){
            numbers[i] = i + 1;
        }
        double average = ArrayOperations.getAverage(numbers);
        Assertions.assertEquals(10.5,average,0.001);
    }
}
