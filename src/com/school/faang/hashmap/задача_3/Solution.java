package com.school.faang.hashmap.задача_3;

import java.util.HashMap;
import java.util.Map;

public class Solution {

    private static final Map<Product, Integer> basket = new HashMap<>();

    public static void main(String[] args) {
        initBasket();
        printInfo();
    }

    private static void initBasket() {
        addProduct(new Product("M99", "Apple Macbook Air"), 1);
        addProduct(new Product("M99", "Apple Macbook Air"), 1);
    }

    private static void printInfo() {
        for (Map.Entry<Product, Integer> entry : basket.entrySet()) {
            System.out.println("Товар: " + entry.getKey().getName() + ", количество: " + entry.getValue());
        }
    }

    public static void addProduct(Product product, int count) {
        basket.merge(product, count, Integer::sum);
    }
}
