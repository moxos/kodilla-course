package com.kodilla.stream.world;

import java.math.BigDecimal;

public final class Country {
    private final BigDecimal quantity;
    private final String countryName;

    public Country(String countryName, BigDecimal quantity) {
        this.quantity = quantity;
        this.countryName = countryName;
    }

    public BigDecimal getPeopleQuantity() {
        return quantity;
    }
}
