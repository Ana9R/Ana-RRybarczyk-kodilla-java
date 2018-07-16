package com.kodilla.patterns2.pizza;

import org.junit.Test;

import java.math.BigDecimal;

import static org.junit.Assert.*;

public class PizzaOrderTestSuite {

    @Test
    public void testBasicPizzaGetCost(){
        //given
        Pizza pizza = new BasicPizza();

        //when
        BigDecimal cost = pizza.getCost();

        //then
        assertEquals(new BigDecimal(15.00), cost);
    }

    @Test
    public void testBasicPizzaGetDescription(){
        //given
        Pizza pizza = new BasicPizza();

        //when
        String description = pizza.getDescription();

        //then
        assertEquals("Pizza with: cheese, tomato sauce", description);
    }

    @Test
    public void testDoubleCheesePizzaGetCost(){
        //given
        Pizza pizza = new BasicPizza();
        pizza = new DoubleCheesePizza(pizza);

        //when
        BigDecimal cost = pizza.getCost();

        //then
        assertEquals(new BigDecimal(19.00), cost);
    }

    @Test
    public void testDoubleCheesePizzaGetDescription(){
        //given
        Pizza pizza = new BasicPizza();
        pizza = new DoubleCheesePizza(pizza);

        //when
        String description = pizza.getDescription();

        //then
        assertEquals("Pizza with: cheese, tomato sauce, extra cheese", description);
    }

    @Test
    public void testPizzaWithOnionAndTomatoGetCost(){
        //given
        Pizza pizza = new BasicPizza();
        pizza = new OnionPizza(pizza);
        pizza = new TomatoPizza(pizza);

        //when
        BigDecimal cost = pizza.getCost();

        //then
        assertEquals(new BigDecimal(20.00), cost);
    }

    @Test
    public void testPizzaWithOnionAndTomatoGetDescription(){
        //given
        Pizza pizza = new BasicPizza();
        pizza = new OnionPizza(pizza);
        pizza = new TomatoPizza(pizza);

        //when
        String description = pizza.getDescription();

        //then
        assertEquals("Pizza with: cheese, tomato sauce, onion, tomato", description);
    }
}