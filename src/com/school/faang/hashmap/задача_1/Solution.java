package com.school.faang.hashmap.задача_1;

public class Solution {
    public static void main(String[] args) {
        VideoLikes videoStats = new VideoLikes();
        //Лайкаем
        videoStats.likeVideo("dQw4w9WgXcQ");
        videoStats.likeVideo("dQw4w9WgXcQ");
        videoStats.likeVideo("dQw4w9WgXcQ");

        videoStats.likeVideo("9bZkp7q19f0");
        videoStats.likeVideo("9bZkp7q19f0");

        videoStats.likeVideo("kJQP7kiw5Fk");

        //Выводим количество лайков в консоль
        System.out.println("Количество лайков для dQw4w9WgXcQ равно - " + videoStats.getLikes("dQw4w9WgXcQ"));
        System.out.println("Количество лайков для 9bZkp7q19f0 равно - " + videoStats.getLikes("9bZkp7q19f0"));
        System.out.println("Количество лайков для kJQP7kiw5Fk равно - " + videoStats.getLikes("kJQP7kiw5Fk"));

    }
}
