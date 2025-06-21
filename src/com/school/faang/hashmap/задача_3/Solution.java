package com.school.faang.hashmap.задача_3;

import java.util.HashMap;
import java.util.Map;
import java.util.Objects;

public class Solution {

    public static Map<Product, Integer> cart = new HashMap<>();

    public static void addProduct(Product product) {
        if (!cart.containsKey(product)) {
            cart.put(product, 1);
            return;
        }

        cart.put(product, cart.get(product) + 1);
    }

    public static void main(String[] args) {
        Product product1 = new Product("123", "Iphone 16 pro");
        Product product2 = new Product("1232", "Iphone 13 pro");
        Product product3 = new Product("111", "Iphone 12 pro");
        Product product4 = new Product("123", "Iphone 16 pro");

        addProduct(product1);
        addProduct(product2);
        addProduct(product3);


//        System.out.println(cart.get(product1));
        addProduct(product4);
//        System.out.println(cart.get(product4));

        System.out.println(product4.getName() + "-" + cart.get(product4));
    }
}


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

    public void setProductId(String productId) {
        this.productId = productId;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }


    @Override
    public boolean equals(Object o) {
        if (o == null || getClass() != o.getClass()) return false;
        Product product = (Product) o;
        return Objects.equals(productId, product.productId);
    }

    @Override
    public int hashCode() {
        return Objects.hashCode(productId);
    }
}