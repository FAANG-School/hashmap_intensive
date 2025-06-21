package com.school.faang.hashmap.task_3;

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

    @Override
    public boolean equals(Object o) {
        if (o == null || getClass() != o.getClass()) return false;
        Product product = (Product) o;
        return Objects.equals(productId, product.productId);
    }

    @Override
    public int hashCode() {
        return Objects.hash(productId);
    }

    public String getProductId() {
        return productId;
    }

    public String getName() {
        return name;
    }

    public void setProductId(String productId) {
        this.productId = productId;
    }

    public void setName(String name) {
        this.name = name;
    }
}

class Cart {
    private Map<Product, Integer> map = new HashMap<>();

    public void addToCart(Product product) {
        map.put(product, map.getOrDefault(product, 0) + 1);
    }

    public void printAll(){
        for(Map.Entry<Product, Integer> entry: map.entrySet()){
            System.out.println("Product name: " + entry.getKey().getName() +
                    ", count is "+ entry.getValue());
        }
    }
}

public class Solution {
    public static void main(String[] args) {

        Cart cart = new Cart();
        cart.addToCart(new Product("1", "ballblue"));
        cart.addToCart(new Product("1", "ballblue"));
        cart.addToCart(new Product("2", "ballgreen"));
        cart.printAll();
    }
}
