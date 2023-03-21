package com.kodilla.good.patterns.flights;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class FlightsProcessor {
    List<Flight> flightList = new ArrayList<>();

       FlightsProcessor(){
        flightList.add(new Flight("Poznan", "Gdansk"));
        flightList.add(new Flight("Warszawa", "Rzeszow"));
        flightList.add(new Flight("Szczecin", "Berlin"));
        flightList.add(new Flight("Paryz", "Gdynia"));
        flightList.add(new Flight("Londyn", "Madryt"));
        flightList.add(new Flight("Madryt", "Londyn"));
        flightList.add(new Flight("Warszawa", "Londyn"));
        flightList.add(new Flight("Londyn", "Warszawa"));
        flightList.add(new Flight("Warszawa", "Madryt"));
}
    public void getDeparture(String firstAirport){
        List<Flight> result;
        result = flightList.stream().filter(departure -> departure.getDeparture().equals(firstAirport)).collect(Collectors.toList());
        System.out.println(result);
    }
    public void getArrival(String secondAirport){
        List<Flight> result;
           result = flightList.stream().filter(arrival ->arrival.getArrival().equals(secondAirport)).collect(Collectors.toList());
           System.out.println(result);
    }
    public void getFlightThrought(String firstAirport, String secondAirport){
        List<Flight> result = new ArrayList<>();
        List<Flight> firstAirportFlights = flightList.stream().filter(departure -> departure.getDeparture().equals(firstAirport)).collect(Collectors.toList());
        List<Flight> lastAirportFlights = flightList.stream().filter(arrival ->arrival.getArrival().equals(secondAirport)).collect(Collectors.toList());
        for (Flight firstAir :
                firstAirportFlights) {
            for (Flight lastAir :
                    lastAirportFlights) {
                if (firstAir.getArrival().equals(lastAir.getDeparture())) {
                    result.add(firstAir);
                    result.add(lastAir);
                }
            }
        }
        System.out.println(result);
    }

}
