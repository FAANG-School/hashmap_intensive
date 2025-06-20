package com.school.faang.hashmap.задача_3;

import java.util.HashMap;
import java.util.Map;

public class Solution {
    public static void main(String[] args) {

        Map<Product, Integer> basket = new HashMap<>();

        Product product1 = new Product("NK-42-BK", "Фен");
        Product product2 = new Product("NK-42-BK", "Фен");

        basket.put(product1, 1);
        basket.put(product2, basket.getOrDefault(product1, 0) + 1);

        for (Map.Entry<Product, Integer> entry : basket.entrySet()) {
            System.out.println(entry.getKey() + " : " + entry.getValue());
        }
    }
}
