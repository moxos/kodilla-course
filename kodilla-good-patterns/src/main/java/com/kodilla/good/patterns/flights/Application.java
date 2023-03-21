package com.kodilla.good.patterns.flights;

import java.util.ArrayList;
import java.util.List;

public class Application {
    public static void main(String[] args) {
        FlightsProcessor flightsProcessor = new FlightsProcessor();
        flightsProcessor.getDeparture("Warszawa");
        flightsProcessor.getArrival("Londyn");
        flightsProcessor.getFlightThrought("Madryt", "Warszawa");
    }
}
