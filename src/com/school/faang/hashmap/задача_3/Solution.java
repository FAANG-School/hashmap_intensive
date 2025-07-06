package com.school.faang.hashmap.задача_3;

import java.util.HashMap;
import java.util.Map;
import java.util.Objects;

public class Solution {
    public static void main(String[] args) {
        Map<Product, Integer> basket = new HashMap<>();
        int counter = 0;

        Product phone = new Product("@qwerty", "Phone 16");
        Product iPhone = new Product("@qwerty", "Phone 16");

        basket.put(phone, ++counter);
        basket.put(iPhone, ++counter);

        System.out.println(basket);
    }
}

class Product {
    private String productId;
    private String name;

    private Product product;

    public Product(String productId, String name) {
        this.productId = productId;
        this.name = name;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Product product = (Product) o;
        return Objects.equals(productId, product.productId);
    }

    @Override
    public int hashCode() {
        return Objects.hash(productId);
    }

    @Override
    public String toString() {
        return "Product{" +
                "productId='" + productId + '\'' +
                ", name='" + name + '\'' +
                '}';
    }
}
