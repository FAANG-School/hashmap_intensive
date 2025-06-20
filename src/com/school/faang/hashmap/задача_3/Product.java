package com.school.faang.hashmap.задача_3;

import java.util.*;

public class Product {

    private final String productID;

    private final String name;

    public Product(String productID, String name) {
        this.productID = productID;
        this.name = name;
    }

    @Override
    public int hashCode() {
        return Objects.hashCode(productID);
    }

    @Override
    public boolean equals(Object obj) {
        if (!(obj instanceof Product)) {
            return false;
        }
        return Objects.equals(((Product) obj).productID, productID);
    }

    @Override
    public String toString() {
        return productID + ":" + name;
    }
}
