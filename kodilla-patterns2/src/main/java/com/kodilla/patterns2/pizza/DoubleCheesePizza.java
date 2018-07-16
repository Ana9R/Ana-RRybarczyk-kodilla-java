package com.kodilla.patterns2.pizza;

import java.math.BigDecimal;

public class DoubleCheesePizza extends AbstractPizzaDecorator {

    public DoubleCheesePizza(Pizza pizza) {
        super(pizza);
    }

    @Override
    public BigDecimal getCost() {
        return super.getCost().add(new BigDecimal(4.00));
    }

    @Override
    public String getDescription() {
        return super.getDescription() + ", extra cheese";
    }

}
