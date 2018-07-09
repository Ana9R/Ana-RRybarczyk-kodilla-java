package com.kodilla.patterns.builder.bigmac;

import com.kodilla.patterns.builder.pizza.Pizza;
import org.junit.Assert;
import org.junit.Test;

public class BigmacTestSuite {

    @Test
    public void testBigmacNew() {
        //Given
        Bigmac bigmac = new Bigmac.BigmacBuilder()
                .ingredient(Ingredient.BECON)
                .burgers(4)
                .sauce(Sauce.STANDARD)
                .ingredient(Ingredient.ONION)
                .ingredient(Ingredient.PICKLE)
                .build();

        //When
        int howManyIngredients = bigmac.getIngredients().size();

        //Then
        Assert.assertEquals(3, howManyIngredients);
        Assert.assertEquals(Sauce.STANDARD, bigmac.getSauce());
        Assert.assertEquals(4, bigmac.getBurgers());
    }
}
