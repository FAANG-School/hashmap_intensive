package com.school.faang.hashset.задача_6;

import java.util.Set;

public class Solution {
    public static void main(String[] args) {
        RecommendationEngine recommendationEngine = new RecommendationEngine();
        recommendationEngine.addVideo("channel1","video11");
        recommendationEngine.addVideo("channel1","video12");
        recommendationEngine.addVideo("channel1","video13");
        recommendationEngine.addVideo("channel1","video14");

        recommendationEngine.addVideo("channel2","video24");
        recommendationEngine.addVideo("channel2","video23");

        recommendationEngine.addVideo("channel3","video33");

        recommendationEngine.addVideo("channel4","video43");
        recommendationEngine.addVideo("channel4","video42");

        Set<String> subscriptions = Set.of("channel1", "channel2", "channel3", "channel4");
        Set<String> watchHistory  = Set.of("video24", "video21", "video1", "video5");

        System.out.println(recommendationEngine.generateFeed(subscriptions, watchHistory));
    }
}
