package com.school.faang.hashmap.задача_5;

import java.util.*;

public class WordCounter {

    private final Map<String, Integer> counter;

    public WordCounter() {
        counter = new HashMap<>();
    }

    public void addWord(String s) {
        if (counter.containsKey(s)) {
            counter.put(s, counter.get(s) + 1);
        }
        else {
            counter.put(s, 1);
        }
    }

    public int getWordAmount(String s) {
        return counter.getOrDefault(s, 0);
    }

    public List<Map.Entry<String, Integer>> getStats() {
        return new ArrayList<>(counter.entrySet());
    }
}
