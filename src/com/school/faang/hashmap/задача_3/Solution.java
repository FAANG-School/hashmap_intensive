package com.school.faang.hashmap.задача_3;

import java.util.HashMap;
import java.util.Map;

public class Solution {
    public static void main(String[] args) {
        Map<Product, Integer> map = new HashMap<>();

        Product p1 = new Product("p1", "iPhone");
        Product p2 = new Product("p1", "iPhone");

        map.put(p1, 1);
        map.put(p2, 1);

        for (Map.Entry<Product, Integer> entry: map.entrySet()) {
            System.out.println(entry.getKey().productId + " " + entry.getValue());
        }
    }
}
