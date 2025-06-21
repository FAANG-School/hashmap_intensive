package com.school.faang.hashmap.задача_1;

import java.util.HashMap;
import java.util.Map;
import java.util.SplittableRandom;


public class Solution {

    public static String generateRandomString(int lenght) {
        SplittableRandom splittableRandom = new SplittableRandom();
        StringBuffer a = new StringBuffer();
        int nextInt, temp;
        for (int i = 0; i < lenght; i++) {
            nextInt = splittableRandom.nextInt(0, 2);
            if (nextInt == 1) {
                temp = splittableRandom.nextInt('A', 'Z');
            } else {
                temp = splittableRandom.nextInt('a', 'z');
            }
            a.append((char) temp);
        }
        return a.toString();
    }
    // Напиши метод `void likeVideo(String videoId)`, который "ставит лайк" видео. Если видео с таким `videoId` еще нет
    // в мапе, он должен добавить его со значением 1. Если уже есть — увеличить количество лайков на 1.
    public static void likeVideo(String videoId, Map<String, Integer> videoLikes) {
        Integer currentLikes = videoLikes.get(videoId);
        videoLikes.put(videoId, 0);
        if (currentLikes == null) {
            videoLikes.put(videoId, 1);
            } else {
            videoLikes.put(videoId, currentLikes + 1);
        }
    }

    public static int getLikes(String videoId, Map<String, Integer> videoLikes) {
        return videoLikes.get(videoId);
    }

    public static void main(String[] args) {

        Map<String, Integer> videoLikes = new HashMap<>();

        String video1 = generateRandomString(7);
        String video2 = generateRandomString(7);
        String video3 = generateRandomString(7);
        String video4 = generateRandomString(7);
        String video5 = generateRandomString(7);

        likeVideo(video1, videoLikes);
        likeVideo(video1, videoLikes);
        likeVideo(video1, videoLikes);
        likeVideo(video1, videoLikes);

        likeVideo(video2, videoLikes);
        likeVideo(video2, videoLikes);

        likeVideo(video3, videoLikes);

        likeVideo(video4, videoLikes);
        likeVideo(video4, videoLikes);
        likeVideo(video4, videoLikes);

        likeVideo(video5, videoLikes);

        for (Map.Entry<String, Integer> entry : videoLikes.entrySet()) {
            String name = entry.getKey();
            System.out.println("Video " + name + " получило " + getLikes(name, videoLikes) + " лайков");
        }


    }
}
