package com.kodilla.exception.test;

public class FlightRunner {
    public static void main(String[] args) {
        Flight flight = new Flight("Berlin", "Moscow");
        FlightFinder flightFinder = new FlightFinder();
        try {
            flightFinder.findFlight(flight);
        } catch (RouteNotFoundException e){
            System.out.println("No flight to "+ flight.getArrivalAirport() + " from " +flight.getDepartureAirport());
        }
    }
}
