package com.kodilla.exception.test;

import java.util.HashMap;
import java.util.Map;

public class SearchFlight {
    public Flight findFilght(Flight flight) throws RouteNotFoundException {

        Map<String, Boolean> searchFlightInMap = new HashMap<>();
        searchFlightInMap.put("Poznań", true);
        searchFlightInMap.put("Warszawa", false);
        searchFlightInMap.put("Wrocław", true);
        searchFlightInMap.put("Kraków", true);
        searchFlightInMap.put("Gdańsk", false);
        searchFlightInMap.put("Berlin", true);

        if (!searchFlightInMap.get(flight.getDepartureAirport()) || !searchFlightInMap.get(flight.getArrivalAirport())) {
            throw new RouteNotFoundException("Given flight can not be performed");
        }
        return flight;
    }

    public static void main(String[] args) {
        Flight flight1 = new Flight("Warszawa", "Wrocław");
        SearchFlight searchFlight = new SearchFlight();
        try {
            searchFlight.findFilght(flight1);
        } catch (RouteNotFoundException a) {
            System.out.println("Flight not found: From: " + flight1.departureAirport + " to: " + flight1.arrivalAirport + a);
        }
        Flight flight2 = new Flight("Berlin", "Kraków");
        try {
            searchFlight.findFilght(flight2);
        } catch (RouteNotFoundException a) {
            System.out.println("Flight not found: From: " + flight2.departureAirport + " to: " + flight2.arrivalAirport + a);
        }

    }
}
