package com.school.faang.hashmap.task_3;

import java.util.HashMap;
import java.util.Map;

public class Basket {
    private final Map<Product, Integer> baskets = new HashMap<>();

    public void add(Product product, Integer count) {
        baskets.put(product, baskets.getOrDefault(product, 0) + count);
    }

    public void showBasket() {
        for (Map.Entry<Product, Integer> entry : baskets.entrySet()) {
            System.out.println("Product " + entry.getKey().productId() + " " + entry.getKey().name() + ": " + entry.getValue());
        }
    }
}
