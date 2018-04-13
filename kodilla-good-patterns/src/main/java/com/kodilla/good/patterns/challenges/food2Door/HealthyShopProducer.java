package com.kodilla.good.patterns.challenges.food2Door;

public class HealthyShopProducer implements Producer {
    @Override
    public boolean process(int amountOfProduct, String nameOfProduct) {
        if (nameOfProduct == null || nameOfProduct.equals("")) {
            return false;
        }
        System.out.println("Order in producer: HealthyShopProducer, product: " + nameOfProduct + ":" + amountOfProduct + "product delivery in 48h");
        return true;
    }
}
