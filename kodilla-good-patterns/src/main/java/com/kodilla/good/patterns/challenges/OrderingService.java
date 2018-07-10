package com.kodilla.good.patterns.challenges;

import java.util.List;

public interface OrderingService {

    void addProduct(String product);
    void addProducts(List<String> products);
    void deleteProduct(String product);
    List<String> order();

}
