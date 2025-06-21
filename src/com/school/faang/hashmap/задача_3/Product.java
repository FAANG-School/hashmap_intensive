package com.school.faang.hashmap.задача_3;

import java.util.Objects;

public class Product {
   private String productId;
   private String name;

    public Product(String productId, String name){
        this.productId = productId;
        this.name = name;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Product product = (Product) o;
        return Objects.equals(productId, product.productId);
    }

    @Override
    public int hashCode(){
        return Objects.hash(productId);
    }


    @Override
    public String toString() {
        return "id='" + productId + "', name='" + name + "'";
    }
    //В классе Product переопредели методы equals() и hashCode().
    // В equals() сравнивай товары по их productId. Подумай, как нужно вычислять hashcode.
}
