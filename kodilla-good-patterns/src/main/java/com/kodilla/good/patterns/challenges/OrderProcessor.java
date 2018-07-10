package com.kodilla.good.patterns.challenges;

import java.util.List;

public class OrderProcessor {

    private OrderingService orderingService;

    public OrderProcessor(OrderingService orderingService) {
        this.orderingService = orderingService;
    }

    public List<String> process(List<String> products) {
        orderingService.addProducts(products);
        return orderingService.order();
    }

}
