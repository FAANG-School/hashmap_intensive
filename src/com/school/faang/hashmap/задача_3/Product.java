package com.school.faang.hashmap.задача_3;
public class Product {
    String productId;
    String name;

    public Product(String productId, String name) {
        this.productId = productId;
        this.name = name;
    }

    public int hashCode(){
        return productId.hashCode();
    }

    public boolean equals(Object obj){
        if(obj instanceof Product){
            Product p = (Product)obj;
            return productId.equals(p.productId);
        }else{
            return false;
        }
    }

    public String toString() {
        return productId  + " " + name;
    }
}
