package com.kodilla.patterns2.pizza;

import java.math.BigDecimal;

public class TomatoPizza extends AbstractPizzaDecorator {

    public TomatoPizza(Pizza pizza) {
        super(pizza);
    }

    @Override
    public BigDecimal getCost() {
        return super.getCost().add(new BigDecimal(3.00));
    }

    @Override
    public String getDescription() {
        return super.getDescription() + ", tomato";
    }

}