package com.kodilla.good.patterns.challenges.food2Door;

public class Food2DoorShop {
    private Producer producer;

    public Food2DoorShop(Producer producer) {
        this.producer = producer;
    }

    public boolean processOfProduct(int amountOfProduct, String nameOfProduct) {
        boolean success = producer.process(amountOfProduct, nameOfProduct);
        return success;
    }

    public static void main(String[] args) {
        ExtraFoodShopProducer extraFoodShopProducer = new ExtraFoodShopProducer();
        HealthyShopProducer healthyShopProducer = new HealthyShopProducer();
        GlutenFreeShopProducer glutenFreeShopProducer = new GlutenFreeShopProducer();
        Food2DoorShop food2DoorShop = new Food2DoorShop(extraFoodShopProducer);
        food2DoorShop.processOfProduct(12, "banan");
        food2DoorShop.processOfProduct(10, null);
    }

}
