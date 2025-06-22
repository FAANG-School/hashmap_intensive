package com.school.faang.hashmap.задача_3;

import java.util.Objects;

public class Product {
    String productId; //уникальный артикул
    String name;

    public Product(String productId, String name) {
        this.productId = productId;
        this.name = name;
    }

    @Override
    public int hashCode() {
        return Objects.hash(productId);
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Product product = (Product) o;
        return productId.equals(product.productId);
    }

    public String getProductId() {
        return productId;
    }

    public String getName() {
        return name;
    }
}