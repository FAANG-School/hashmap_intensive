package com.school.faang.hashmap.задача_3;

import java.util.Objects;
import java.util.Map;
import java.util.HashMap;

public class Solution {
    static class Product {
        private String productId;
        private String name;

        @Override
        public int hashCode() {
            return Objects.hash(productId);
        }
        @Override
        public boolean equals(Object o) {
            if (o == null) {
                return false;
            }
            Product product = (Product) o;

            return productId.equals(product.productId);
        }
        public Product(String productId, String name) {
            this.productId = productId;
            this.name = name;
        }

        public String getProductId() {
            return productId;
        }

        public String getName() {
            return name;
        }
    }

    private Map<Product, Integer> productMap;

    public Solution() {
        productMap = new HashMap<>();
    }

    public void addProduct(Product product) {
        if (productMap.containsKey(product)) {
            productMap.put(product, productMap.get(product) + 1);
        }
        else {
            productMap.put(product, 1);
        }
    }

    public void displayProducts() {
        for (Map.Entry<Product, Integer> entry : productMap.entrySet()) {
            Product product = entry.getKey();
            Integer amount = entry.getValue();
            System.out.println("Товар " + product.getName() + ", количество: " + amount);
        }
    }

    public static void main(String[] args) {
        Product phone_x = new Product("12345","phone_x");
        Product phone_x_2 = new Product("12345","phone_x");
        Solution bucket = new Solution();
        bucket.addProduct(phone_x);
        bucket.addProduct(phone_x_2);
        bucket.displayProducts();
    }
}
