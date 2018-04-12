package com.kodilla.good.patterns.challenges;

import java.util.ArrayList;
import java.util.List;

public class ShoppingBasket {
    List<String> products = new ArrayList<String>();

    public void addProduct(String productToAdd) {
        products.add(productToAdd);
    }

    public void deleteProduct(String productToDelete) {
        products.remove(productToDelete);
    }

    public List<String> getProducts() {
        return products;
    }
}
