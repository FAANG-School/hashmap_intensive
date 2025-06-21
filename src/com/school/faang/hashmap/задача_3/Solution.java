package com.school.faang.hashmap.задача_3;

import java.util.HashMap;
import java.util.Map;

public class Solution {
    public static void main(String[] args) {
        Product p1 = new Product("p1", "product1");
        Product p2 = new Product("p1", "product1");
        Map<Product, Integer> map = new HashMap<>();
        map.put(p1, map.getOrDefault(p1, 0) + 1);
        map.put(p2, map.getOrDefault(p2, 0) + 1);
        for (Map.Entry<Product, Integer> entry : map.entrySet()) {
            System.out.println(entry.getKey().productid + " " + entry.getValue());

        }

    }
}
