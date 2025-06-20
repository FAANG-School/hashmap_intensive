package com.school.faang.hashmap.задача_6;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

public class Solution {
    public static void main(String[] args) {
        Manager manager = new Manager();

        List<String> text = new ArrayList<>(List.of(
                "@anna пишет твит с хэштегами #java и #programming.",
                "@anna пишет еще один твит с #java.",
                "@ivan пишет твит с хэштегом #java.",
                "@ivan пишет твит с хэштегом #java.",
                "@ivan пишет твит с хэштегом #java."));

        List<String[]> massiveList = manager.splitText(text);
        List<Tweet> tweets = manager.makeTweetList(massiveList);
        Map<String, Map<String, Integer>> sortMap = manager.makeSortMap(tweets);
        Map<String, String> finalMap = manager.getTopAuthors(sortMap);

        for(Map.Entry<String, String> map: finalMap.entrySet()) {
            String hashTeg = map.getKey();
            String name = map.getValue();

            System.out.println("Хештег: "+ hashTeg+" - "+ name+ " имя автора");
        }

    }
}
