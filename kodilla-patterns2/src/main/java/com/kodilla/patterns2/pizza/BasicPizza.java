package com.kodilla.patterns2.pizza;

import java.math.BigDecimal;

public class BasicPizza implements Pizza{

    @Override
    public BigDecimal getCost() {
        return new BigDecimal(15.00);
    }

    @Override
    public String getDescription() {
        return "Pizza with: cheese, tomato sauce";
    }
}
