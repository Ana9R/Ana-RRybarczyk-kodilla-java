package com.kodilla.good.patterns.challenges;

import java.util.List;

public class ShoppingService implements OrderingService {

    private ShoppingBasket basket = new ShoppingBasket();

    public void addProduct(String product) {
        basket.addProduct(product);
    }

    public void addProducts(List<String> products) {
        basket.addProducts(products);
    }

    public void deleteProduct(String product) {
        basket.deleteProduct(product);
    }

    public List<String> order() {
        System.out.println("Ordered" + basket.getProducts());
        return basket.getProducts();
    }

}
