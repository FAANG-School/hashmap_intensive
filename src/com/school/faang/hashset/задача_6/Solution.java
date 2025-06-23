package com.school.faang.hashset.задача_6;

import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class Solution {
    public static void main(String[] args) {
        RecommendationEngine engine = new RecommendationEngine();

        engine.addVideo("Техноблог", "Обзор нового смартфона");
        engine.addVideo("Техноблог", "Сравнение процессоров");
        engine.addVideo("Техноблог", "Лучшие ноутбуки 2023");

        engine.addVideo("Кулинарный канал", "Рецепт пиццы");
        engine.addVideo("Кулинарный канал", "Десерт за 5 минут");

        engine.addVideo("Фитнес канал", "Утренняя зарядка");
        engine.addVideo("Фитнес канал", "Тренировка дома");

        Set<String> subscriptions = new HashSet<>();
        subscriptions.add("Техноблог");
        subscriptions.add("Кулинарный канал");
        subscriptions.add("Фитнес канал");

        Set<String> watchHistory = new HashSet<>();
        watchHistory.add("Рецепт пиццы");
        watchHistory.add("Обзор нового смартфона");

        for (int i = 1; i <= 3; i++) {
            List<String> feed = engine.generateFeed(subscriptions, watchHistory);
            System.out.println("\nРекомендации #" + i + ":");
            for (String video : feed) {
                System.out.println("- " + video);
            }
        }
    }
}
