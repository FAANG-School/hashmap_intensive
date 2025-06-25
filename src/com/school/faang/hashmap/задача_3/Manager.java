package com.school.faang.hashmap.задача_3;

import java.util.HashMap;
import java.util.Map;

public class Manager {

    Map<Product, Integer> basket = new HashMap<>();

    public void addProduct(Product product) {
        Integer number = basket.get(product);
        if (number == null) {
            basket.put(product,1);
        } else {
            basket.put(product, number+1);
        }
    }
    public void getAllProduct() {
        for (Map.Entry<Product, Integer> product: basket.entrySet()) {
            String name = product.getKey().getName();
            int number = product.getValue();
            System.out.println("Наименование товара: "+ name +"; Кол-во: "+number);
        }
    }

}
/*Создай класс Product с полями String productId (уникальный артикул) и String name.

Создай Map<Product, Integer>, который будет представлять корзину. Ключ — это товар, а значение — его количество.

Самый важный шаг: В классе Product переопредели методы equals() и hashCode(). В equals() сравнивай товары по их productId. Подумай, как нужно вычислять hashcode.

В main создай два объекта Product с одинаковыми productId и name.

Добавь первый товар в корзину. Затем добавь второй (точно такой же) товар.

Выведи содержимое корзины на экран и убедись, что в ней всего одна запись для этого товара с количеством 2.*/