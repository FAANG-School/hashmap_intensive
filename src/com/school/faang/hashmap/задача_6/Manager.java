package com.school.faang.hashmap.задача_6;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Manager {
    List<Tweet> tweets = new ArrayList<>();

    public List<String[]> splitText(List<String> text) {

        List<String[]> massiveList = new ArrayList<>();
        for (String words : text) {
            String newWord = words.replaceAll("\\.", "");
            String[] splitText = newWord.split(" ");
            massiveList.add(splitText);
        }
        return massiveList;
    }

    public List<Tweet> makeTweetList(List<String[]> massiveList) {
        List<Tweet> tweetList = new ArrayList<>();

        for (String[] mas : massiveList) {
            Tweet tweet = new Tweet();
            for (String word : mas) {
                if (word.startsWith("@")) {
                    tweet.setAuthor(word);
                }
                if (word.startsWith("#")) {
                    tweet.getHashtags().add(word);
                }
            }
            tweetList.add(tweet);
        }
        return tweetList;
    }

    public Map<String, Map<String, Integer>> makeSortMap(List<Tweet> tweets) {
        int count = 0;
        Map<String, Map<String, Integer>> statisticMap = new HashMap<>();

        for (Tweet tweet : tweets) {
            String name = tweet.getAuthor();
            List<String> hashTegList = tweet.getHashtags();
            for (String hashTeg : hashTegList) {
                Map<String, Integer> map = statisticMap.get(hashTeg);
                if (map == null) {
                    map = new HashMap<>();
                    map.put(name, 1);
                    statisticMap.put(hashTeg, map);
                } else {
                    int number = map.getOrDefault(name, 0);
                    map.put(name,number + 1);
                    statisticMap.put(hashTeg, map);
                }
            }
        }

        return statisticMap;
    }
    public Map<String, String> getTopAuthors(Map<String, Map<String, Integer>> statisticMap) {

        Map<String, String> finalMap = new HashMap<>();
        String name = null;
        int count = 0;

        for(Map.Entry<String,Map<String, Integer>> map : statisticMap.entrySet()) {
            String hashTeg = map.getKey();
            Map<String, Integer> namesNumbers = map.getValue();

            for (Map.Entry<String, Integer> map2 : namesNumbers.entrySet()) {
                int number = map2.getValue();
                if (number > count) {
                    name = map2.getKey();
                    count = number;
                }
            }
            finalMap.put(hashTeg, name);
        }
        return finalMap;
    }
}
