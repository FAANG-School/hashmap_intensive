package com.school.faang.hashmap.задача_3;

public class Solution {
    public static void main(String[] args) {
        ProductManager manager = new ProductManager();

        manager.addProduct(new Product("1", "Айфон"));
        manager.addProduct(new Product("1", "Айфон"));
        manager.addProduct(new Product("2", "Ноутбук"));

        manager.showProducts();
    }

    public record Product(String productId, String name) {

        @Override
        public String toString() {
            return "Product{" +
                    "productId='" + productId + '\'' +
                    ", name='" + name + '\'' +
                    '}';
        }

        @Override
        public int hashCode() {
            return Objects.hash(productId);
        }

        @Override
        public boolean equals(Object obj) {
            if (this == obj) return true;
            if (!(obj instanceof Product other)) return false;

            return Objects.equals(this.productId, other.productId);
        }
    }

    public class ProductManager {
        private final Map<Product, Integer> products = new HashMap<>();

        public void addProduct(Product product) {
            products.put(product, products.getOrDefault(product, 0) + 1);
        }

        public void showProducts() {
            for (Map.Entry<Product, Integer> entry : products.entrySet()) {
                System.out.println(entry.getKey() + " " + entry.getValue());
            }
        }
    }
}
