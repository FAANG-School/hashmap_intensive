package com.school.faang.hashmap.задача_1;

import java.util.HashMap;
import java.util.Map;

public class Solution {
    //Мапа для лайков к видосам
    public Map<String, Integer> videosLikes = new HashMap<>();

    //Ставим лайки в методе main
    public void main(String[] args) {
        var video_1 = "Q62jop2009PPJ";
        var video_2 = "099PKK876JHIU";
        var video_3 = "OIHO2AI6H5I5O";
        var video_4 = "FY985UHG765AD";
        var video_5 = "PLPP432sd98HU";

        likeVideo(video_1);
        likeVideo(video_2);
        likeVideo(video_3);
        likeVideo(video_4);
        likeVideo(video_5);
        likeVideo(video_1);
        likeVideo(video_2);
        likeVideo(video_1);
        likeVideo(video_3);

        System.out.println("Первое видео набрало " + getLikes(video_1) + " лайка(-ов).");
        System.out.println("Второе видео набрало " + getLikes(video_2) + " лайка(-ов).");
        System.out.println("Третье видео набрало " + getLikes(video_3) + " лайка(-ов).");
        System.out.println("Четвертое видео набрало " + getLikes(video_4) + " лайка(-ов).");
        System.out.println("Пятое видео набрало " + getLikes(video_5) + " лайка(-ов).");
    }

    public void likeVideo(String videoId) {
        //Если нет ключа добавляем
        if (!videosLikes.containsKey(videoId)) {
            videosLikes.put(videoId, 0);
        }
        //Прибовляем значение
        Integer value = videosLikes.get(videoId);
        videosLikes.replace(videoId, value, value +1);
    }

    public int getLikes(String videoId) {
        return videosLikes.get(videoId);
    }
}
