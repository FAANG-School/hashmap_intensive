package com.school.faang.hashmap.задача_3;

import java.util.Objects;

public class Product {
    private final long productId;
    private final String productName;

    public Product(long productId, String productName) {
        this.productId = productId;
        this.productName = productName;
    }

    public String getProductName() {
        return productName;
    }

    public long getProductId() {
        return productId;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Product product = (Product) o;
        return productId == product.productId;
    }

    @Override
    public int hashCode() {
        return Objects.hash(productId);
    }

    @Override
    public String toString() {
        return "Product{" +
                "productId=" + productId +
                ", productName='" + productName + '\'' +
                '}';
    }
}
