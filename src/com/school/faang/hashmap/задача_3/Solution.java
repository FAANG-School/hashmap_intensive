package com.school.faang.hashmap.задача_3;

public class Solution {
    public static void main(String[] args) {
        Basket basket = new Basket();
        basket.addProduct(new Product("123", "milk"));
        basket.addProduct(new Product("123", "milk"));
        basket.addProduct(new Product("256", "cheese"));
        basket.addProduct(new Product("256", "cheese"));
        basket.addProduct(new Product("256", "cheese"));
        for (var entry : basket.getAllProducts()) {
            System.out.println(entry.getKey() + " " + entry.getValue());
        }
    }
}
