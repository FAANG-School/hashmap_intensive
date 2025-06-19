package com.school.faang.hashmap.задача_3;

import java.util.Objects;

public class Product {


   private String productId;
   private String name;

   public Product(String productId, String name) {
      this.productId = productId;
      this.name = name;
   }

   @Override
   public int hashCode() {
      int hash = 17;
      int prime = 31;
      hash = hash * prime +(productId!=null? productId.hashCode(): 0);
      return hash;
   }
   @Override
   public boolean equals(Object o) {
      if (this == o) return true;
      if (o == null || getClass() != o.getClass()) return false;
      Product product = (Product) o;
      return Objects.equals(productId, product.productId);
   }
   public String getProductId() {
      return productId;
   }

   public String getName() {
      return name;
   }
}
