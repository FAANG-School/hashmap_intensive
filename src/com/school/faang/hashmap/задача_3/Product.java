package com.school.faang.hashmap.задача_3;

import java.util.Objects;

public class Product {
    String productId;
    String name;

    public Product(String productId, String name) {
        this.productId = productId;
        this.name = name;
    }

    @Override
    public String toString() {
        return name + " (арт. " + productId + ")" + " кол-во:";
    }

    @Override
    public boolean equals(Object o) {

        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Product product = (Product) o;
        return productId.equals(product.productId);

    }

    @Override
    public int hashCode() {

        return Objects.hash(productId);

    }
}
