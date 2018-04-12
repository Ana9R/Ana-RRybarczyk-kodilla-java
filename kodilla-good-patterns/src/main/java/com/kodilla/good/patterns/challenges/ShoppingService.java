package com.kodilla.good.patterns.challenges;

public class ShoppingService {
    private ShoppingBasket basket = new ShoppingBasket();
    private OrderingService orderingService = new OrderingService();

    public void addProduct(String product) {
        basket.addProduct(product);
    }

    public void deleteProduct(String product) {
        basket.deleteProduct(product);
    }

    public void order() {
        orderingService.order(basket);
    }

    public static void main(String[] args) {
        ShoppingService shoppingService = new ShoppingService();
        shoppingService.addProduct("telefon");
        shoppingService.addProduct("gruszka");
        shoppingService.addProduct("but");
        shoppingService.addProduct("marchewka");
        shoppingService.addProduct("gra planszowa");
        shoppingService.deleteProduct("gruszka");
        shoppingService.order();
    }

}
