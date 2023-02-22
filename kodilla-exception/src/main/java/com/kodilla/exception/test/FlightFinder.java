package com.kodilla.exception.test;

import java.util.HashMap;

public class FlightFinder {

    public void findFlight(Flight flight) throws RouteNotFoundException {
        HashMap<String, Boolean> flightsMap = new HashMap<>();
        flightsMap.put("Krakow", false);
        flightsMap.put("Berlin", true);
        flightsMap.put("Moscow", true);
        flightsMap.put("Madryt", false);

        if (flightsMap.containsKey(flight.getArrivalAirport())) {
            System.out.println("Flight Exist");
        }else{
                throw new RouteNotFoundException();
            }
        }
    }

