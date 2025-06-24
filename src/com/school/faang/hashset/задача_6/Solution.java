package com.school.faang.hashset.задача_6;

import java.util.Set;
import java.util.HashSet;
public class Solution {
    public static void main(String[] args) {
        RecommendationEngine videosByChannel = new RecommendationEngine ();
        videosByChannel.addVideo("FaangSchool",  "HashMap");
        videosByChannel.addVideo("FaangSchool",  "HashSet");
        videosByChannel.addVideo("FaangSchool",  "Собеседования");
        videosByChannel.addVideo("PoliticalCentry",  "Экономическая повестка");
        videosByChannel.addVideo("Понятная История",  "Римская империя");
        videosByChannel.addVideo("ChemistryLab",  "Интересные опыты");
        HashSet<String> subscriptions = new HashSet<> (videosByChannel.getVideos());
        HashSet<String> watchHistory = new HashSet<> ();
        watchHistory.add("HashMap");
        watchHistory.add("HashSet");
        System.out.println(videosByChannel.generateFeed(subscriptions,watchHistory) );
    }
}
