package com.school.faang.hashmap.задача_3;

import java.util.HashMap;
import java.util.Map;
import java.util.NoSuchElementException;

public class Cart {
    private Map<Product, Integer> cartBd;

    public Cart() {
        this.cartBd  = new HashMap<>();;
    }

    public Map<Product, Integer> getCartBd() {
        return cartBd;
    }

    public void addProduct(Product product) {
        if(cartBd.containsKey(product)) {
            cartBd.compute(product,(k, currentProduct) -> currentProduct + 1);
            return;
        }
        cartBd.put(product,1);
    }

    public Integer getCount(Product product) {
        if(cartBd.containsKey(product)) {
            return cartBd.get(product);
        }
        throw new NoSuchElementException("товар не найден");
    }

}
