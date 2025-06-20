package com.school.faang.hashmap.задача_6;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class Solution {
    public static void main(String[] args) {
        List<Tweet> data = new ArrayList<>();
        data.add(new Tweet("@elonmusk", List.of("#grok", "#programming")));
        data.add(new Tweet("@durov", List.of("#telegram", "#france")));
        data.add(new Tweet("@durov", List.of("#telegram")));
        data.add(new Tweet("@anna", List.of("#java")));
        data.add(new Tweet("@anna", List.of("#java", "#programming")));
        data.add(new Tweet("@anna", List.of("#java", "#programming")));
        data.add(new Tweet("@ivan", List.of("#telegram", "#programming")));

        System.out.println(findTopAuthors(data));
    }

    private static Map<String, String> findTopAuthors(List<Tweet> tweets) {
        Map<String, Map<String, Integer>> tempMap = tweets.stream()
                .flatMap(tweet -> tweet.hashtags().stream()
                        .map(e -> Map.entry(e, tweet.author())))
                .collect(Collectors.groupingBy(
                        Map.Entry::getKey,
                        Collectors.groupingBy(
                                Map.Entry::getValue,
                                Collectors.collectingAndThen(Collectors.counting(), Long::intValue)
                        )
                ));

        Map<String, String> topAuthors = tempMap.entrySet().stream()
                .collect(Collectors.toMap(
                        Map.Entry::getKey,
                        entry -> entry.getValue().entrySet().stream()
                                .max(Map.Entry.comparingByValue())
                                .get()
                                .getKey()
                ));

        return topAuthors;
    }
}
