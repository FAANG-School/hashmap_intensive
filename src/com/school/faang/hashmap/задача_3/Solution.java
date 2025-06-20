package com.school.faang.hashmap.задача_3;

import java.util.HashMap;
import java.util.Map;

public class Solution {

    private final Map<Product, Integer> products = new HashMap<>();
    public static void main(String[] args) {
        Solution solution = new Solution();
        solution.addProduct(new Product(11223, "Phone-x"));
        solution.addProduct(new Product(11223, "Phone-x"));
        solution.addProduct(new Product(1343, "Box"));
        solution.showProducts();
    }

    private void addProduct(Product product) {
        products.put(product, products.getOrDefault(product,0) + 1);
    }

    private void showProducts() {
        for(Map.Entry<Product, Integer> entry: products.entrySet()) {
            System.out.println(entry.getKey() + " count = " + entry.getValue());
        }
    }
}
