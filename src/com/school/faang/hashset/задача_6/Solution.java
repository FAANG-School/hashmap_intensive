package com.school.faang.hashset.задача_6;

import java.util.HashSet;
import java.util.List;

public class Solution {
    public static void main(String[] args) {

        HashSet<String> subscriptions = new HashSet<>();
        subscriptions.add("1");
        subscriptions.add("2");
        subscriptions.add("3");
        subscriptions.add("4");

        HashSet<String> watchHistory = new HashSet<>();
        watchHistory.add("Ёжик в тумане");

        RecommendationEngine recommend = new RecommendationEngine();

        recommend.addVideo("1","Ёжик в тумане");
        recommend.addVideo("2","Ёж 2. Новые иголки");
        recommend.addVideo("3","Просто Ёж и точка");
        recommend.addVideo("4","Влад, что всё таки собрать на Войда?");

        List<String> recommendationsVideos= recommend.generateFeed(subscriptions, watchHistory);
        System.out.println(recommendationsVideos);
    }
}
