package com.school.faang.hashmap.задача_3;

public class Solution {
    public static void main(String[] args) {
        Product product1 = new Product("productOne","Телефон");
        Product product2 = new Product("productTwo","Телефон1");
        Product product3 = new Product("productTwo","Телефон1");

        Cart cart = new Cart();
        cart.addProduct(product1);
        cart.addProduct(product2);
        cart.addProduct(product3);

        for (Product product : cart.getCartBd().keySet()) {
            System.out.printf("ID продукта %s, количество %s ", product.getProductId(),cart.getCount(product));
        }
    }
}
