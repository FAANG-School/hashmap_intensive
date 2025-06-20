package com.school.faang.hashmap.задача_1;

import java.util.*;

public class LikeCounter {
    private final Map<String, Integer> countDict;

    public LikeCounter() {
        countDict = new HashMap<>();
    }

    public void setLike(String videoID) {
        int value = 0;
        if (countDict.containsKey(videoID)) {
            value = countDict.get(videoID);
        }
        countDict.put(videoID, ++value);
    }

    public int getLikes(String videoID) {
        return countDict.getOrDefault(videoID, 0);
    }

    public List<String> getVideosId() {
        return new ArrayList<>(countDict.keySet());
    }
}