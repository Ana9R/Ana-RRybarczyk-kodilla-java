package com.kodilla.good.patterns.challenges.Airplanes;

import java.util.Objects;


public class InDirectFlight {
    private Flight flight1;
    private Flight flight2;

    public InDirectFlight(Flight flight1, Flight flight2) {
        this.flight1 = flight1;
        this.flight2 = flight2;
    }

    public Flight getFlight1() {
        return flight1;
    }

    public Flight getFlight2() {
        return flight2;
    }

    @Override
    public String toString() {
        return "InDirectFlight{" +
                "flight1=" + flight1 +
                ", flight2=" + flight2 +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        InDirectFlight that = (InDirectFlight) o;
        return Objects.equals(flight1, that.flight1) &&
                Objects.equals(flight2, that.flight2);
    }

    @Override
    public int hashCode() {
        return Objects.hash(flight1, flight2);
    }
}
