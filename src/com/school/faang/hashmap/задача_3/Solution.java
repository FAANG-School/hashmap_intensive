package com.school.faang.hashmap.задача_3;
import java.util.*;
public class Solution {

    public static void main(String[] args) {
        int sum = 0;
        Map <Product, Integer> products = new HashMap <>();
               Product Apelsin1 = new Product("#56465", "Apelsin");
               Product Apelsin2 = new Product("#56465", "Apelsin");
               products.put(Apelsin1, sum++);
        products.put(Apelsin2, sum++);
        for (Map.Entry<Product, Integer> entry : products.entrySet()) {
            Product product = entry.getKey();
            Integer integer = entry.getValue();
            System.out.println(product.productId + " " + product.name + " " + sum);

        }
    }
}
