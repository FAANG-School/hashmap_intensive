package com.school.faang.hashmap.задача_1;

import java.util.HashMap;
import java.util.Map;

public class Solution {
  private final Map<String, Integer> videoLikes = new HashMap<>();

  public void likeVideo(String videoId) {
    Integer currentLikes = videoLikes.get(videoId);
    if (currentLikes == null) {
      // Видео лайкают впервые
      videoLikes.put(videoId, 1);
    } else {
      // Видео уже лайкали, увеличиваем счетчик
      videoLikes.put(videoId, currentLikes + 1);
    }
  }

  public int getLikes(String videoId) {
    Integer likes = videoLikes.get(videoId);
    return likes != null ? likes : 0;
  }

  public static void main(String[] args) {
    Solution counter = new Solution();

    // Лайкаем видео
    counter.likeVideo("dQw4w9WgXcQ");
    counter.likeVideo("dQw4w9WgXcQ");
    counter.likeVideo("9bZkp7q19f0");
    counter.likeVideo("dQw4w9WgXcQ");
    counter.likeVideo("3JZ_D3ELwOQ");
    counter.likeVideo("9bZkp7q19f0");

    // Выводим количество лайков
    System.out.println("Лайки на dQw4w9WgXcQ: " + counter.getLikes("dQw4w9WgXcQ"));
    System.out.println("Лайки на 9bZkp7q19f0: " + counter.getLikes("9bZkp7q19f0"));
    System.out.println("Лайки на 3JZ_D3ELwOQ: " + counter.getLikes("3JZ_D3ELwOQ"));
    System.out.println("Лайки на неизвестное видео: " + counter.getLikes("unknownID"));
  }
}
