package com.kodilla.patterns2.decorator.taxiportal;

import org.junit.Test;

import java.math.BigDecimal;

import static org.junit.Assert.*;

public class TaxiOrderTestSuite {

    @Test
    public void testBasicOrderGetCost() {
        //given
        TaxiOrder theOrder = new BasicTaxiOrder();

        //when
        BigDecimal calculatedCost = theOrder.getCost();

        //then
        assertEquals(new BigDecimal(5.00), calculatedCost);
    }

    @Test
    public void testBasicOrderGetDescription() {
        //given
        TaxiOrder theOrder = new BasicTaxiOrder();

        //when
        String description = theOrder.getDescription();

        //then
        assertEquals("Drive a course", description);
    }

    @Test
    public void testTaxiNetworkGetCost() {
        //given
        TaxiOrder theOrder = new BasicTaxiOrder();
        theOrder = new TaxiNetworkOrderDecorator(theOrder);

        //when
        BigDecimal calculatedCost = theOrder.getCost();

        //then
        assertEquals(new BigDecimal(40.00), calculatedCost);
    }

    @Test
    public void testTaxiNetworkGetDescription() {
        //given
        TaxiOrder theOrder = new BasicTaxiOrder();
        theOrder = new TaxiNetworkOrderDecorator(theOrder);

        //when
        String description = theOrder.getDescription();

        //then
        assertEquals("Drive a course by Taxi Network", description);
    }

    public void testMyTaxiWithChildSeatGetCost() {
        //given
        TaxiOrder theOrder = new BasicTaxiOrder();
        theOrder = new TaxiNetworkOrderDecorator(theOrder);
        theOrder = new ChildSeatDecorator(theOrder);

        //when
        BigDecimal calculatedCost = theOrder.getCost();

        //then
        assertEquals(new BigDecimal(37.00), calculatedCost);
    }

    @Test
    public void testMyTaxiWithChildSeatGetDescription() {
        //given
        TaxiOrder theOrder = new BasicTaxiOrder();
        theOrder = new TaxiNetworkOrderDecorator(theOrder);
        theOrder = new ChildSeatDecorator(theOrder);

        //when
        String description = theOrder.getDescription();

        //then
        assertEquals("Drive a course by Taxi Network + child seat", description);
    }

    public void testUberWithTwoChildSeatGetCost() {
        //given
        TaxiOrder theOrder = new BasicTaxiOrder();
        theOrder = new TaxiNetworkOrderDecorator(theOrder);
        theOrder = new ChildSeatDecorator(theOrder);
        theOrder = new ChildSeatDecorator(theOrder);

        //when
        BigDecimal calculatedCost = theOrder.getCost();

        //then
        assertEquals(new BigDecimal(29.00), calculatedCost);
    }

    @Test
    public void testUberWithTwoChildSeatGetDescription() {
        //given
        TaxiOrder theOrder = new BasicTaxiOrder();
        theOrder = new TaxiNetworkOrderDecorator(theOrder);
        theOrder = new ChildSeatDecorator(theOrder);
        theOrder = new ChildSeatDecorator(theOrder);

        //when
        String description = theOrder.getDescription();

        //then
        assertEquals("Drive a course by Taxi Network + child seat + child seat", description);
    }

    @Test
    public void testVipTaxiChildSeatGetCost() {
        //given
        TaxiOrder theOrder = new BasicTaxiOrder();
        theOrder = new TaxiNetworkOrderDecorator(theOrder);
        theOrder = new VipCarDecorator(theOrder);
        theOrder = new ChildSeatDecorator(theOrder);

        //when
        BigDecimal calculatedCost = theOrder.getCost();

        //then
        assertEquals(new BigDecimal(52.00), calculatedCost);
    }

    @Test
    public void testVipTaxiChildSeatGetDescription() {
        //given
        TaxiOrder theOrder = new BasicTaxiOrder();
        theOrder = new TaxiNetworkOrderDecorator(theOrder);
        theOrder = new VipCarDecorator(theOrder);
        theOrder = new ChildSeatDecorator(theOrder);

        //when
        String description = theOrder.getDescription();

        //then
        assertEquals("Drive a course by Taxi Network variant VIP + child seat", description);
    }



}