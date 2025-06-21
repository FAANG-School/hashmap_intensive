package com.school.faang.hashmap.task_3;

import java.util.HashMap;
import java.util.Map;

public class Solution {

    public static void main(String[] args) {
        System.out.println("Basket of goods");

        Map<Product, Integer> cart = new HashMap<>();

        Product smartphoneX_instance1 = new Product("SMART_X", "Smartphone X");
        Product smartphoneX_instance2 = new Product("SMART_X", "Smartphone X");


        Product wirelessHeadphones = new Product("HEAD_Z", "Wireless headphones Z");

        cart.put(smartphoneX_instance1, cart.getOrDefault(smartphoneX_instance1, 0) + 1);
        System.out.println("Add: " + smartphoneX_instance1.getName() + " (first time)");


        cart.put(smartphoneX_instance2, cart.getOrDefault(smartphoneX_instance2, 0) + 1);
        System.out.println("Add: " + smartphoneX_instance2.getName() + " (second time)");


        cart.put(wirelessHeadphones, cart.getOrDefault(wirelessHeadphones, 0) + 1);
        System.out.println("Add: " + wirelessHeadphones.getName() + " (first time)");


        System.out.println("\nBasket contents (expected 'Smartphone X' = 2)");

        for (Map.Entry<Product, Integer> entry : cart.entrySet()) {
            Product productInCart = entry.getKey();
            Integer quantityInCart = entry.getValue();
            System.out.println("Product: '" + productInCart.getName() + "' (Article number: " + productInCart.getProductId() + "), Quantity: " + quantityInCart);
        }
    }
}