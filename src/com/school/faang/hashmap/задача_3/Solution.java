package com.school.faang.hashmap.задача_3;

import java.util.*;

public class Solution {
    static Map<Product, Integer> basket = new HashMap<>();

    public static void addToBasket(Product product) {
        basket.put(product, basket.getOrDefault(product, 0) + 1);
    }
    public static void main(String[] args) {
        Product product1 = new Product("Product", "phone");
        Product product2 = new Product("Product", "phone");
        addToBasket(product1);
        addToBasket(product2);
        for(Map.Entry<Product, Integer> entry : basket.entrySet()) {
            Product product = entry.getKey();
            int value = entry.getValue();
            System.out.println(product + " " + value);
        }
    }


}
