package com.school.faang.hashmap.задача_1;

import java.util.HashMap;
import java.util.Map;

public class Solution {
    public static Map<String, Integer> videoLikes = new HashMap<>();

    public static void main(String[] args) {
        Solution solution = new Solution();
        videoLikes.put("Гарри Поттер и ФК", 5);
        videoLikes.put("Гарри Поттер и ТК", 0);
        videoLikes.put("Гарри Поттер и УА", 0);

        solution.likeVideo("Гарри Поттер и ФК");
        solution.likeVideo("Гарри Поттер и ФК");
        solution.likeVideo("Гарри Поттер и ФК");

        solution.likeVideo("Гарри Поттер и ТК");

        System.out.println(solution.getLikes("Гарри Поттер и ФК"));
        System.out.println(solution.getLikes("Гарри Поттер и ТК"));
        System.out.println(solution.getLikes("Гарри Поттер и УА"));
    }

    public void likeVideo(String videoId) { // добавление лайка на видео
        if (!videoLikes.containsKey(videoId)) {
            videoLikes.put(videoId, 1);
        } else {
            int value = videoLikes.get(videoId) + 1;
            videoLikes.put(videoId, value);
        }
    }

    public int getLikes(String videoId) { //получение количества лайков
        if (videoLikes.containsKey(videoId)) {
            return videoLikes.get(videoId);
        } else {
            return 0;
        }
    }
}
