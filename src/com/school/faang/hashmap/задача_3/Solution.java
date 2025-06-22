package com.school.faang.hashmap.задача_3;

import java.util.HashMap;
import java.util.Map;


class Solution {

    static void addToCart(Product product, Map<Product, Integer> hashMap) {
        Integer quantity = hashMap.get(product);
        if (quantity == null) {
            hashMap.put(product, 1);
        } else {
            hashMap.put(product, quantity + 1);
        }
    }
    public static void main(String[] args) {

        Map<Product, Integer> cart = new HashMap<>(); // корзина Ключ — это товар, а значение — его количество.

        Product product1 = new Product("1254856", "Смартфон X");
        Product product2 = new Product("1254856", "Смартфон X");
        Product product4 = new Product("1254856", "Смартфон X");
        Product product3 = new Product("1254857", "Смартфон Y");

        addToCart(product1, cart);
        addToCart(product2, cart);
        addToCart(product3, cart);
        addToCart(product4, cart);

        for (Map.Entry<Product, Integer> entry : cart.entrySet()) {
            System.out.println(entry.getKey().getName() + " количество " + entry.getValue());
        }


    }
}
