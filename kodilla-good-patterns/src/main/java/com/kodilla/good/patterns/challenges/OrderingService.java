package com.kodilla.good.patterns.challenges;

import java.util.ArrayList;
import java.util.List;

public class OrderingService {


    public void order(ShoppingBasket basket) {
        List<String> a = basket.getProducts();
        System.out.println("Zamawiam produkty:" + a);
    }

  }
