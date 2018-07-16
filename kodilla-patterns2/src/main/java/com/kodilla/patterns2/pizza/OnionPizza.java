package com.kodilla.patterns2.pizza;

import java.math.BigDecimal;

public class OnionPizza extends AbstractPizzaDecorator {

    public OnionPizza(Pizza pizza) {
        super(pizza);
    }

    @Override
    public BigDecimal getCost() {
        return super.getCost().add(new BigDecimal(2.00));
    }

    @Override
    public String getDescription() {
        return super.getDescription() + ", onion";
    }

}
