package com.school.faang.hashmap.задача_1;


import java.util.HashMap;
import java.util.Map;

public class Solution {

    private static Map<String, Integer> videoLikes = new HashMap<>();


    public static void likeVideo(String videoId) {
        Integer currentLikes = videoLikes.get(videoId);
        if (currentLikes == null) {
            videoLikes.put(videoId, 1);
        } else {
            videoLikes.put(videoId, currentLikes + 1);
        }
    }

    public static int getLikes(String videoId) {
        return videoLikes.getOrDefault(videoId, 0);
    }


    public static void main(String[] args) {

        likeVideo("ID №1");
        likeVideo("ID №1");
        likeVideo("ID №2");
        likeVideo("ID №3");
        likeVideo("ID №3");
        likeVideo("ID №3");

        // Проверка результатов
        System.out.println("ID №1 " + getLikes("ID №1") + " лайка"); // 2
        System.out.println("ID №2: " + getLikes("ID №2") + " лайка");           // 1
        System.out.println("ID №3: " + getLikes("ID №3") + " лайка");           // 3
        System.out.println("unknownID: " + getLikes("unknownID")); // 0
    }
}

