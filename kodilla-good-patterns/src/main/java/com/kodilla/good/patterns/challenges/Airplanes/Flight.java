package com.kodilla.good.patterns.challenges.Airplanes;


import java.util.Objects;

public class Flight {
    private String departurePlace;
    private String arrivalPlace;

    public Flight(String departurePlace, String arrivalPlace) {
        this.departurePlace = departurePlace;
        this.arrivalPlace = arrivalPlace;
    }

    public String getDeparturePlace() {
        return departurePlace;
    }

    public String getArrivalPlace() {
        return arrivalPlace;
    }

    @Override
    public String toString() {
        return "Flight{" +
                "departurePlace='" + departurePlace + '\'' +
                ", arrivalPlace='" + arrivalPlace + '\'' +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Flight flight = (Flight) o;
        return Objects.equals(departurePlace, flight.departurePlace) &&
                Objects.equals(arrivalPlace, flight.arrivalPlace);
    }

    @Override
    public int hashCode() {

        return Objects.hash(departurePlace, arrivalPlace);
    }

}
