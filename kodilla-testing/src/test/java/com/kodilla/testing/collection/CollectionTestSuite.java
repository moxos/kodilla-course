package com.kodilla.testing.collection;

import org.junit.jupiter.api.*;

import java.util.ArrayList;

import java.util.List;

public class CollectionTestSuite {
    @BeforeEach
    public void before() {
        System.out.println("Test Case: begin");
    }

    @AfterEach
    public void after() {
        System.out.println("Test Case: end");
    }

    @DisplayName("Check two blank lists")
    @Test
    void testOddNumbersExterminatorEmptyList() {

        List<Integer> numbers = new ArrayList<>();
        OddNumbersExterminator odd = new OddNumbersExterminator(numbers);
        List<Integer> check = new ArrayList<>();
        List<Integer> result = odd.exterminate(numbers);
        Assertions.assertEquals(check,result);


    }
    @DisplayName("Checking if the method selects even numbers correctly")
    @Test
    void testOddNumbersExterminatorNormalList(){

        List<Integer> numbers = new ArrayList<>();
        numbers.add(1);
        numbers.add(3);
        numbers.add(6);
        numbers.add(10);
        OddNumbersExterminator odd = new OddNumbersExterminator(numbers);

        List<Integer> check = new ArrayList<>();
        check.add(6);
        check.add(10);
        List<Integer> result = odd.exterminate(numbers);
        Assertions.assertEquals(check, result);
    }
}
