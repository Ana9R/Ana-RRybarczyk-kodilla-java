package com.kodilla.stream.world;

import org.junit.Assert;
import org.junit.Test;

import java.math.BigDecimal;
import java.math.RoundingMode;
import java.util.ArrayList;
import java.util.List;

public class WorldTestSuite {
    @Test
    public void testGetPeopleQuantity() {
        //Given

        BigDecimal peopleQuantity6 = new BigDecimal(14.45);
        Country czad = new Country(peopleQuantity6);

        BigDecimal peopleQuantity5 = new BigDecimal(95.69);
        Country egipt = new Country(peopleQuantity5);

        List<Country> countries2 = new ArrayList<>();
        countries2.add(czad);
        countries2.add(egipt);
        Continent afryka = new Continent(countries2);
        List<Continent> continents = new ArrayList<>();
        continents.add(afryka);

        BigDecimal peopleQuantity3 = new BigDecimal(207.7);
        Country brazylia = new Country(peopleQuantity3);

        BigDecimal peopleQuantity2 = new BigDecimal(43.85);
        Country argentyna = new Country(peopleQuantity2);

        BigDecimal peopleQuantity1 = new BigDecimal(17.91);
        Country chile = new Country(peopleQuantity1);

        List<Country> countries1 = new ArrayList<>();
        countries1.add(brazylia);
        countries1.add(argentyna);
        countries1.add(chile);
        Continent amerykaPoludniowa = new Continent(countries1);
        continents.add(amerykaPoludniowa);

        World world = new World(continents);


        //When
        BigDecimal sumPeopleQuantity = world.getPeopleQuantity();

        //Then
        Assert.assertEquals(new BigDecimal(379.6).setScale(2, RoundingMode.HALF_EVEN), sumPeopleQuantity.setScale(2, RoundingMode.HALF_EVEN));
    }
}
