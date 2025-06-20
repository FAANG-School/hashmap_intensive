package com.school.faang.hashmap.task_3;

public class Solution {
    public static void main(String[] args) {
        Basket basket = new Basket();

        basket.add(new Product("Iphone_1457", "Iphone"), 1);
        basket.add(new Product("Iphone_1457", "Iphone"), 1);
        basket.add(new Product("Iphone_1484", "Samsung"), 1);

        basket.showBasket();
    }
}
