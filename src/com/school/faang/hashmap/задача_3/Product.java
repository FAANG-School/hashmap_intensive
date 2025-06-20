package com.school.faang.hashmap.задача_3;

import java.util.Objects;

public class Product {
    String productId;
    String name;
    public Product (String productId, String name) {
        this.productId = productId;
        this.name = name;
    }
    @Override public int hashCode() {
        return Objects.hash(productId, name);
    }
    @Override public boolean equals(Object o) {
        if (o == null) {
                   return false;
        }
        Product product = (Product) o;
        return name.equals(product.name) && productId == product.productId;
    }

}
