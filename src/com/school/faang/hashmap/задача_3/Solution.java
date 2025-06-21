package com.school.faang.hashmap.задача_3;

import java.util.HashMap;
import java.util.Map;

public class Solution {

    private static Map<Product, Integer> cart = new HashMap<>();

    public static void main(String[] args) {
            Product product1 = new Product("dk23", "iPhone15");
            Product product2 = new Product("dk23", "iPhone15");

        cart.put(product1, cart.getOrDefault(product1, 0) + 1);
        cart.put(product2, cart.getOrDefault(product2, 0) + 1);

        for (Map.Entry<Product, Integer> entry: cart.entrySet()) {
            System.out.println(entry.getKey() + " " + entry.getValue());
        }
    }
}
