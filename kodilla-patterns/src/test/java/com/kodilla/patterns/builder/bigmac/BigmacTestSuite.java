package com.kodilla.patterns.builder.bigmac;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class BigmacTestSuite {

    @Test
    void testBigMac(){
        Bigmac bigmac=new Bigmac.BigmacBuilder()
                .bun("Sesame")
                .burgers(3)
                .sauce("1000 wysp")
                .ingredients("salad","onion","bacon","cucumber","chilli","cheese")
                .build();
        System.out.println(bigmac);
        int result = bigmac.getBurgers();
        String bun = bigmac.getBun();
        String sauce = bigmac.getSauce();
        Assertions.assertEquals(3, result);
        Assertions.assertEquals("Sesame", bun);
        Assertions.assertEquals("1000 wysp",sauce);
    }
}
