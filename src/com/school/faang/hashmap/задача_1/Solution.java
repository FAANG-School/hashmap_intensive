package com.school.faang.hashmap.задача_1;

import java.util.HashMap;
import java.util.Map;

public class Solution {
    static final Map<String, Integer> likes = new HashMap<>();

    public static void main(String[] args) {

        for (int i = 0; i < 5; i++) {
            likeVideo("first");
        }

        for (int i = 0; i < 12312; i++) {
            likeVideo("second");
        }

        likeVideo("third");

        System.out.println("name: first, likes: " + getLikes("first"));
        System.out.println("name: second, likes: " + getLikes("second"));
        System.out.println("name: third, likes: " + getLikes("third"));
        System.out.println("name: zero, likes: " + getLikes("zero"));
    }

    private static void likeVideo(String videoId) {
        likes.put(videoId, likes.getOrDefault(videoId, 0) + 1);
    }

    private static int getLikes(String videoId) {
        return likes.getOrDefault(videoId, 0);
    }
}
