package com.school.faang.hashmap.задача_3;

import java.util.HashMap;
import java.util.Map;
import java.util.Objects;


class Product {
    private String productId;
    private String name;

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

    @Override
    public boolean equals(Object o) {
        if (this == o) return true; // сравнение с самим собой
        if (o == null || getClass() != o.getClass()) return false;

        Product product = (Product) o;
        return productId.equals(product.productId);
    }

    @Override
    public int hashCode() {
        return Objects.hash(productId);
    }
}

public class Solution {
    public static void main(String[] args) {
        Map<Product, Integer> cart = new HashMap<>();

        // Два "одинаковых" товара
        Product phone1 = new Product("X123", "Смартфон X");
        Product phone2 = new Product("X123", "Смартфон X");

        // Добавляем первый товар
        cart.put(phone1, 1);

        // Добавляем второй, "такой же" товар
        cart.put(phone2, cart.getOrDefault(phone2, 0) + 1);


        for (Map.Entry<Product, Integer> entry : cart.entrySet()) {
            Product product = entry.getKey();
            int quantity = entry.getValue();
            System.out.println(product.getName() + " (артикул: " + product.getProductId() + ") — количество: " + quantity);
        }
    }
}
