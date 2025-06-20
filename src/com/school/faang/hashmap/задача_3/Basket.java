package com.school.faang.hashmap.задача_3;

import java.util.*;

public class Basket {

    private final Map<Product, Integer> productCounter;

    public Basket() {
        productCounter = new HashMap<>();
    }

    public void addProduct(Product product) {
        productCounter.put(product, productCounter.getOrDefault(product, 0) + 1);
    }

    public int getProductCount(Product product) {
        return productCounter.getOrDefault(product, 0);
    }

    public List<Map.Entry<Product, Integer>> getAllProducts() {
        return new ArrayList<>(productCounter.entrySet());
    }
}
