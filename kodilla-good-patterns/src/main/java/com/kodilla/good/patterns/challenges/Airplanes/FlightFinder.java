package com.kodilla.good.patterns.challenges.Airplanes;

import java.util.HashSet;
import java.util.Set;
import java.util.stream.Collectors;

public class FlightFinder {

    public Set<Flight> flights = new HashSet<Flight>();

    public FlightFinder(Set<Flight> flights) {
        this.flights = flights;
    }

    public Set<Flight> findFrom(String departurePlace) {
        return flights.stream()
                .filter(a -> a.getDeparturePlace().equals(departurePlace))
                .collect(Collectors.toSet());
    }

    public Set<Flight> findTo(String arrivalPlace) {
        return flights.stream()
                .filter(a -> a.getArrivalPlace().equals(arrivalPlace))
                .collect(Collectors.toSet());
    }

    public Set<InDirectFlight> findIndirectFligts(String middlePlace) {
        Set<Flight> flights1 = findTo(middlePlace);
        Set<Flight> flights2 = findFrom(middlePlace);
        Set<InDirectFlight> flightFinal = new HashSet<InDirectFlight>();
        for (Flight flight1 : flights1) {
            for (Flight flight2 : flights2) {
                InDirectFlight inDirectFlight = new InDirectFlight(flight1, flight2);
                flightFinal.add(inDirectFlight);
            }
        }
        return flightFinal;
    }

    public static void main(String[] args) {
        Set<Flight> flightSet = new HashSet<Flight>();
        Flight flight1 = new Flight("Poznan", "Krakow");
        Flight flight2 = new Flight("Gdansk", "Warszawa");
        Flight flight3 = new Flight("Wroclaw", "Gdansk");
        Flight flight4 = new Flight("Poznan", "Wroclaw");
        Flight flight5 = new Flight("Wroclaw", "Warszawa");
        Flight flight6 = new Flight("Gdansk", "Wroclaw");

        flightSet.add(flight1);
        flightSet.add(flight2);
        flightSet.add(flight3);
        flightSet.add(flight4);
        flightSet.add(flight5);
        flightSet.add(flight6);

        FlightFinder flightFinder = new FlightFinder(flightSet);

        String departurePlace = "Wroclaw";
        Set<Flight> a = flightFinder.findFrom(departurePlace);
        System.out.println("All flights from:" + " " + departurePlace + a);

        String arrivalPlace = "Warszawa";
        Set<Flight> b = flightFinder.findTo(arrivalPlace);
        System.out.println("All flights to:" + " " + arrivalPlace + b);

        String middlePlace = "Wroclaw";
        Set<InDirectFlight> c = flightFinder.findIndirectFligts(middlePlace);
        System.out.println("All flights through:" + " " + middlePlace + c);
    }
}
