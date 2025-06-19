package com.school.faang.hashmap.задача_3;

import java.util.HashMap;
import java.util.Map;

public class Solution {
    public static void main(String[] args) {
        HashMap<Product, Integer> cart  = new HashMap<>();

        Product smartphone1 = new Product("X123", "Смартфон X");
        Product smartphone2 = new Product("X123", "Смартфон X");

        addToCart(cart, smartphone2);
        addToCart(cart, smartphone1);

        for (Map.Entry<Product, Integer> entry : cart.entrySet()) {
            System.out.println(entry.getKey() + " кол-во: " + entry.getValue());
        }
    }

    private static void addToCart(Map<Product, Integer> cart, Product product) {
        cart.put(product, cart.getOrDefault(product, 0) + 1);
    }
}
