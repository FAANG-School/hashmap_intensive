package com.school.faang.hashmap.задача_5;

import java.util.HashMap;
import java.util.Map;
import java.util.stream.Collectors;

public class Solution {

    public static void main(String[] args) {

        String text = "\"Снег, снег, снег идет, засыпая все вокруг. Снег, как пух, ложится на крыши, на деревья, на землю. " +
                "Снег, снег, снег... Тихо, тихо, тихо... Все замерло в ожидании весеннего тепла, в ожидании тепла, тепла, тепла.\" ";

        Solution solution = new Solution();
        Map<String, Integer> counterMap = solution.getWordCount(text);

        System.out.println(counterMap.entrySet().stream().filter(entry -> entry.getValue() > 5).collect(Collectors.toSet()));
    }

    public Map<String, Integer>getWordCount(String text) {
        Map<String, Integer> counterMap = new HashMap<>();

        text = text.toLowerCase();
        text = text.replaceAll("[^a-zа-я\\s]","");

        for(String str: text.split(" ")) {
            if(str.isEmpty())
                continue;
            counterMap.put(str, counterMap.getOrDefault(str,0)+1);
        }
        return counterMap;
    }
}
