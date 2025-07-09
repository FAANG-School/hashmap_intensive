package com.school.faang.hashmap.задача_4;

import java.util.*;

public class Solution {

    public static Map<String, List<String>> groupSongsByGenre(List<String> songs) {
        Map<String, List<String>> genreMap = new HashMap<>();

        for (String entry : songs) {
            // Разделяем строку на название песни и жанр
            String[] parts = entry.split(" - ");
            String songTitle = parts[0].trim();
            String genre = parts[1].trim();

            // Получаем список песен для жанра или создаем новый
            List<String> songsOfGenre = genreMap.getOrDefault(genre, new ArrayList<>());

            // Добавляем песню
            songsOfGenre.add(songTitle);

            // Обновляем мапу (нужно, если мы использовали getOrDefault)
            genreMap.put(genre, songsOfGenre);
        }

        return genreMap;
    }

    public static void main(String[] args) {
        // Входные данные
        List<String> inputSongs = Arrays.asList(
                "Bohemian Rhapsody - Rock",
                "Smells Like Teen Spirit - Rock",
                "Shape of You - Pop",
                "Blinding Lights - Pop",
                "Lose Yourself - Hip-Hop"
        );


        Map<String, List<String>> grouped = groupSongsByGenre(inputSongs);

        for (Map.Entry<String, List<String>> entry : grouped.entrySet()) {
            String genre = entry.getKey();
            List<String> songs = entry.getValue();

            System.out.println("Жанр: " + genre);
            for (String song : songs) {
                System.out.println("  - " + song);
            }
        }
    }
}
