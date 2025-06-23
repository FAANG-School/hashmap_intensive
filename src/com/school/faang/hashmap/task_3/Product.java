package com.school.faang.hashmap.task_3;

import java.util.Objects;

public class Product {
    private String productId;
    private String name;

    public Product(String productId, String name){
        this.productId = productId;
        this.name = name;
    }

    public String getProductId(){
        return productId;
    }
    public String getName(){
        return name;
    }

    @Override
    public String toString(){
        return "Product(" + "productId='" + productId + '\'' +
                ", name='" + name + '\'' + ')';
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
}