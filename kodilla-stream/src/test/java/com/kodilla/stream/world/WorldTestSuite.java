package com.kodilla.stream.world;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import java.math.BigDecimal;

public class WorldTestSuite {
    @Test
    public void testGetPeopleQuantity() {
        World world = new World();
        Continent Europe = new Continent("Europe");
        Continent Africa = new Continent("Africa");
        Europe.addCountry(new Country("Poland", new BigDecimal("123456789")));
        Europe.addCountry(new Country("Italy", new BigDecimal("123456789")));
        Europe.addCountry(new Country("France", new BigDecimal("123456789")));
        Africa.addCountry(new Country("Kongo", new BigDecimal("99874563")));
        Africa.addCountry(new Country("Egypt", new BigDecimal("99874563")));
        Africa.addCountry(new Country("Maroko", new BigDecimal("99874563")));

        world.addContinent(Europe);
        world.addContinent(Africa);
        BigDecimal people = world.getPeopleQuantity();
        BigDecimal expectedPeople = new BigDecimal("669994056");
        Assertions.assertEquals(expectedPeople,people);

    }
}
