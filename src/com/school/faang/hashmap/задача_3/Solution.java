package com.school.faang.hashmap.задача_3;

import java.util.HashMap;
import java.util.Map;
import java.util.Objects;

class Product{
    String productId;
    String name;

    public Product(String productId, String name) {
        this.productId = productId;
        this.name = name;
    }

    @Override
    public boolean equals(Object o){
        if(this==o) return true;
        if(o==null) return false;
        if(getClass()!=o.getClass()) return false;
        Product product = (Product) o;
        return productId.equals(product.productId);
    }
    @Override
    public int hashCode(){
        return Objects.hash(productId);
    }
}
class Basket{
    Map<Product,Integer> listProducts = new HashMap<>();
    public void addProduct(Product product, int count){
        if(listProducts.containsKey(product)){
            Integer nowCount = listProducts.get(product);
            listProducts.put(product, nowCount+1);
        }
        else {
            listProducts.put(product, count);
        }
    }
    public void printProducts(){
        for (Map.Entry<Product,Integer> counts:listProducts.entrySet()) {
            Product id = counts.getKey();
            Integer count = counts.getValue();
            System.out.println("Название товара: "+ id.name+"\nКоличество данного товара: "+ count);
        }
    }
}
public class Solution {
    public static void main(String[] args) {
        Product product1 = new Product("34626323","Смартфон X");
        Product product2 = new Product("34626323","Смартфон X");
        Product product3 = new Product("56735666","Смартфон 453sd");
        Product product4 = new Product("56735666","Смартфон 453sd");
        Product product5 = new Product("56735666","Смартфон 453sd");
        Basket basket = new Basket();
        basket.addProduct(product1,1);
        basket.addProduct(product2,1);
        basket.addProduct(product3,1);
        basket.addProduct(product4,1);
        basket.addProduct(product5,1);
        basket.printProducts();
    }
}
