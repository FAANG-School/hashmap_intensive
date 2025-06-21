package com.school.faang.hashmap.задача_3;

public class Product {
    String productid;
    String name;

    public Product(String productid, String name) {
        this.productid = productid;
        this.name = name;
    }

    @Override
    public boolean equals(Object o) {
        if (!(o instanceof Product product)) return false;

        return productid.equals(product.productid);
    }

    @Override
    public int hashCode() {
        return productid.hashCode();
    }
}
