package com.school.faang.hashset.задача_6;

import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class Solution {
    public static void main(String[] args) {

        RecommendationEngine engine = new RecommendationEngine();

        engine.addVideo("TechReviews", "Обзор нового iPhone 15");
        engine.addVideo("TechReviews", "Лучшие ноутбуки 2023");
        engine.addVideo("CookingChannel", "5 рецептов пасты");
        engine.addVideo("CookingChannel", "Идеальный стейк дома");
        engine.addVideo("ScienceFun", "10 научных мифов");
        engine.addVideo("ScienceFun", "Как работают черные дыры?");
        engine.addVideo("TravelVlog", "Неизведанная Япония");

        Set<String> subscriptions = new HashSet<>();
        subscriptions.add("TechReviews");
        subscriptions.add("ScienceFun");
        subscriptions.add("TravelVlog");

        Set<String> watchHistory = new HashSet<>();
        watchHistory.add("Обзор нового iPhone 15");
        watchHistory.add("10 научных мифов");

        for (int i = 1; i <= 3; i++) {

            List<String> feed = engine.generateFeed(subscriptions, watchHistory);
            System.out.println("\nЛента рекомендаций #" + i + ":");

            for (String video : feed) {

                System.out.println("▶ " + video);

            }
        }
    }
}
