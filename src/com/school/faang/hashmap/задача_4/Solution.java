package com.school.faang.hashmap.задача_4;

import java.util.*;

public class Solution {
    public static void main(String[] args) {


        List<String> songs = Arrays.asList(
                "Bohemian Rhapsody - Rock",
                "Smells Like Teen Spirit - Rock",
                "Shape of You - Pop",
                "Blinding Lights - Pop",
                "Lose Yourself - Hip-Hop",
                "Hotel California - Rock",
                "Bad Guy - Pop",
                "Stan - Hip-Hop",
                "Thunderstruck - Rock",
                "Dance Monkey - Pop"
        );


        Map<String, List<String>> songsByGenre = groupSongsByGenre(songs);

        for (Map.Entry<String, List<String>> entry : songsByGenre.entrySet()) {
            System.out.println("\nЖанр: " + entry.getKey());
            System.out.println("Песни: " + String.join(", ", entry.getValue()));
            System.out.println("Песни: " + entry.getValue().size());
        }

    }

    static Map<String, List<String>> groupSongsByGenre(List<String> songs) {

        Map<String, List<String>> genreMap = new HashMap<>();

        for (String song : songs) {
            String[] parts = song.split(" - ");
            if (parts.length < 2) {
                continue;
            }

            String genreTitle = parts[0].trim();
            String genre = parts[1].trim();

            genreMap.computeIfAbsent(genre, k -> new ArrayList<>()).add(genreTitle);
        }

        return genreMap;
    }
}

/*
## Группировка песен по жанрам для Яндекс.Музыки
Ты устроился в команду Яндекс.Музыки. Одна из самых популярных фич — это плейлисты и радио по жанрам. Чтобы это работало быстро, сервису не нужно каждый раз сканировать всю гигантскую фонотеку в поисках песен в жанре "Рок".
Вместо этого данные заранее готовятся и группируются.
Твоя задача — написать утилиту, которая берет общий список песен и раскладывает их по "полкам"-жанрам.
HashMap здесь подойдет идеально: ключом будет название жанра (String), а значением — целый список (List<String>) песен этого жанра.

## Что нужно сделать:
Подготовь "входные данные": создай `List<String>`, где каждый элемент — это строка формата "Название песни - Жанр". Например: "Bohemian Rhapsody - Rock", "Smells Like Teen Spirit - Rock", "Shape of You - Pop", "Blinding Lights - Pop", "Lose Yourself - Hip-Hop".
Создай метод, который принимает на вход этот список и возвращает `Map<String, List<String>>`.
Внутри метода перебери все строки из входного списка. Для каждой строки:
Раздели ее на название песни и жанр.
Проверь, есть ли такой жанр уже в твоей мапе.
Если жанра еще нет, создай для него новый пустой список, добавь в него текущую песню и положи эту пару (жанр, список) в мапу.
Если жанр уже есть, просто получи по нему список и добавь в него новую песню.
В `main` вызови свой метод и распечатай результат, чтобы увидеть готовую мапу с песнями, сгруппированными по жанрам.
 */