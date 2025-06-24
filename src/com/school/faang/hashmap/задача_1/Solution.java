package com.school.faang.hashmap.задача_1;

import java.util.HashMap;
import java.util.Map;

public class Solution {
    private final Map<String, Integer> likesMap = new HashMap<>();

    private void likeVideo(String videoId) {
        likesMap.put(videoId, getLikes(videoId) + 1);
    }

    private int getLikes(String videoId) {
        return likesMap.getOrDefault(videoId, 0);
    }

    public static void main(String[] args) {
        Main main = new Main();

        main.likeVideo("dQw4w9WgXcQ");
        main.likeVideo("dQw4w9WgXcQ");
        main.likeVideo("xvFZjo5PgG0");
        main.likeVideo("dQw4w9WgXcQ");
        main.likeVideo("xvFZjo5PgG0");
        main.likeVideo("abcdefgh1234");

        System.out.println("Likes for dQw4w9WgXcQ: " + main.getLikes("dQw4w9WgXcQ"));
        System.out.println("Likes for xvFZjo5PgG0: " + main.getLikes("xvFZjo5PgG0"));
        System.out.println("Likes for abcdefgh1234: " + main.getLikes("abcdefgh1234"));
        System.out.println("Likes for unknownID: " + main.getLikes("unknownID"));
    }
}
