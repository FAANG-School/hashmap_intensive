package com.school.faang.hashmap.задача_1;
import java.util.*;

public class Solution {
    public static Map <String, Integer> videoLikes;

    public static void main(String[] args) {
        videoLikes = new HashMap<> ();
        likeVideo("Генерация случайных слов");
        likeVideo("Генерация случайных чисел");
        likeVideo("Генерация случайных слов");
        System.out.println(getLikes("Генерация случайных слов"));
        System.out.println(getLikes("Генерация случайных чисел"));
    }

    public static void likeVideo(String videoId) {
        Integer currentLikes = videoLikes.get(videoId);
        if (currentLikes == null) {
            videoLikes.put(videoId, 1);
        } else {
            videoLikes.put(videoId, currentLikes + 1);
        }
    }
    public static int getLikes(String videoId) {
        Integer currentLikes = videoLikes.get(videoId);
        if (currentLikes == null) {
            return 0;
        } else {
            return currentLikes;
        }
    }
}
