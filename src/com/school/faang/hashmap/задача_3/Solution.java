package com.school.faang.hashmap.задача_3;

import java.util.HashMap;
import java.util.Map;

public class Solution {
    private static final Map<Product, Integer> basket = new HashMap<>();


    public static void main(String[] args) {
        Product product1 = new Product("X12345", "Product Test");
        Product product2 = new Product("X12345", "Product Test");

        addProduct(product1, 2);
        addProduct(product2, 4);

        System.out.println(basket);
    }

    static void addProduct(Product product, Integer amount) {
        basket.put(product, basket.getOrDefault(product, 0) + amount);

    }
}