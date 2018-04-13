package com.kodilla.good.patterns.challenges.food2Door;

public class ExtraFoodShopProducer implements Producer {
    @Override
    public boolean process(int amountOfProduct, String nameOfProduct) {
        if (nameOfProduct == null || nameOfProduct.equals("")) {
            return false;
        }
        System.out.println("Order in producer: ExtraFoodShopProducer, product: " + nameOfProduct + ":" + amountOfProduct + "product delivery in 24h");
        return true;
    }
}
