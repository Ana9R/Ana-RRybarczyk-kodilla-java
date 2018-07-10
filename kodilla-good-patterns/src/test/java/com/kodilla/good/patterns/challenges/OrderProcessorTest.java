package com.kodilla.good.patterns.challenges;

import org.junit.Assert;
import org.junit.Test;

import java.util.ArrayList;
import java.util.List;

public class OrderProcessorTest {

    @Test
    public void shouldOrderProducts(){
        //given
        OrderProcessor orderProcessor = new OrderProcessor(new ShoppingService());
        List<String> products = new ArrayList<>();
        products.add("Book: Clean code");
        products.add("Movie: Holiday");

        //when
        List<String> ordered = orderProcessor.process(products);

        //then
        Assert.assertTrue(ordered.contains("Book: Clean code"));
        Assert.assertTrue(ordered.contains("Movie: Holiday"));
        Assert.assertFalse(ordered.contains("Board game: Smallworld"));
    }


}