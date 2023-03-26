package com.example.kodilla.spring.calculator;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
public class CalculatorTestSuite {
    @Autowired
    Calculator calculator;

    @Test
    void testCalculations(){
        Assertions.assertEquals(2.0,calculator.add(1.0,1.0));
        Assertions.assertEquals(5.0,calculator.sub(10.0,5.0));
        Assertions.assertEquals(12.0,calculator.mul(3.0,4.0));
        Assertions.assertEquals(15.0, calculator.div(30.0,2.0));
    }
}
