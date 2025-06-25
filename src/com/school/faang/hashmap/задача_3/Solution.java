package com.school.faang.hashmap.задача_3;

public class Solution {
    public static void main(String[] args) {
        Manager manager = new Manager();
        Product product = new Product("120AQ","Наручники");
        Product product2 = new Product("120AQ","Наручники");
        manager.addProduct(product);
        manager.addProduct(product2);
        manager.getAllProduct();
    }
}
