package com.school.faang.hashmap.задача_1;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.Random;

public class Solution {
    public static void main(String[] args) {
        Youtube youtube = new Youtube();

        List<String> videosId = new ArrayList<>(){{
            add("Я Нашел Свое Первое Резюме в IT Через 8 Лет (кринж)");
            add("ХЭШ-МАП За 40 Мин С Нуля | HashMap Для Начинающих");
            add("ЭТОТ Паттерн Спрашивают на 99% Собесов");
            add("Хочешь в IT? Удели Мне 49 Мин - Я Сэкономлю Тебе ГОДЫ");
        }};

        videosId.stream().forEach(video -> {
            int rand = new Random().nextInt(1, 10);
            while (rand-- > 0){
                youtube.likeVideo(video);
            }
        });

        System.out.println(youtube.getLikes("Видео, которого нет\n"));

        for (Map.Entry<String, Integer> entry: youtube.getVideos().entrySet()) {
            System.out.println("У видео '" + entry.getKey() + "' набралось " + entry.getValue() + " likes!");
        }
    }
}
