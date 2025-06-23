package com.school.faang.hashmap.задача_3;

import java.util.HashMap;
import java.util.Map;

public class Solution {
    public static void main(String[] args) {

        Map<Product, Integer> map = new HashMap<>();

        Product product1 = new Product("1", "IphoneX");
        Product product2 = new Product("1", "IphoneX");

        print(map);

        map.merge(product1, 1,Integer::sum);
        print(map);

        System.out.println();

        map.merge(product2, 1, Integer::sum);
        print(map);

        Product headphones = new Product("HP-A55", "Наушники Pro");
        map.merge(headphones, 3, Integer::sum);

        System.out.println("\nПосле добавления наушников -");
        print(map);

    }

    static void print(Map<Product, Integer> map) {

        if (map.isEmpty()) {
            System.out.println("Корзина пуста!\n");
            return;
        }

        System.out.println("Cодержимое корзины:");
        for (Map.Entry<Product, Integer> entry : map.entrySet()) {
            Product product = entry.getKey();
            Integer value = entry.getValue();
            System.out.println(product + " " + value);
        }
    }
}
