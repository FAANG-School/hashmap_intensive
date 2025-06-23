package com.school.faang.hashset.задача_6;

import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;

public class Solution {
    public static void main(String[] args) {
        HashSet<String> subscriptions = new HashSet<>();
        HashSet<String> watchHistory = new HashSet<>();
        watchHistory.add("Ёжик в тумане");

        RecommendationEngine recomend = new RecommendationEngine();

        recomend.addVideo("1","Ёжик в тумане");
        recomend.addVideo("2","Ёж 2. Новые иголки");
        recomend.addVideo("3","Просто Ёж и точка");
        recomend.addVideo("4","Влад, что всё таки собрать на Войда?");

        List<String> recommendationsVideos= recomend.generateFeed(subscriptions, watchHistory);
        System.out.println(recommendationsVideos);
    }
}
