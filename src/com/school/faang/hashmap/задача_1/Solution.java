package com.school.faang.hashmap.задача_1;

import java.util.HashMap;

public class Solution {

    private final HashMap<String, Integer> likes = new HashMap<>();

    public static void main(String[] args) {

    }

    public void likeVideo(String videoId) {
        likes.put(videoId, likes.getOrDefault(videoId, 0) + 1);
    }

    public int getLikes(String videoId) {
        return likes.getOrDefault(videoId, 0);
    }
}
