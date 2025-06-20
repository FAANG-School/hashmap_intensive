package com.school.faang.hashmap.задача_1;

import java.util.HashMap;
import java.util.Map;

public class VideoLikes {
    private Map<String, Integer> videoLikes;

    public VideoLikes() {
        videoLikes = new HashMap<>();
    }

    // Метод для добавления лайка видео
    public void likeVideo(String videoId) {
        Integer currentLikes = videoLikes.get(videoId);

        if (currentLikes == null) {
            // Видео лайкают впервые
            videoLikes.put(videoId, 1);
        } else {
            // Увеличиваем количество лайков на 1
            videoLikes.put(videoId, currentLikes + 1);
        }
    }

    // Метод для получения количества лайков видео
    public int getLikes(String videoId) {
        Integer likes = videoLikes.get(videoId);
        return likes == null ? 0 : likes;
    }
}
