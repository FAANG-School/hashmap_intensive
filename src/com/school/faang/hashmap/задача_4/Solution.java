package com.school.faang.hashmap.задача_4;

import java.util.*;

public class Solution {
    public static void main(String[] args) {
        List<String> songs = Arrays.asList(
                "Bohemian Rhapsody - Rock",
                "Smells Like Teen Spirit - Rock",
                "Shape of You - Pop",
                "Blinding Lights - Pop",
                "Lose Yourself - Hip-Hop"
        );

        Map<String, List<String>> grouped = groupSongsByGenre(songs);

        for (Map.Entry<String, List<String>> entry : grouped.entrySet()) {
            String genre = entry.getKey();
            List<String> songList = entry.getValue();

            System.out.println("Жанр: " + genre);

            for (String song : songList) {
                System.out.println("  - " + song);
            }
        }
    }

    public static Map<String, List<String>> groupSongsByGenre(List<String> songs) {
        Map<String, List<String>> genreMap = new HashMap<>();
        for (String entry : songs) {
            String[] parts = entry.split(" - ");
            if (parts.length != 2) continue;

            String songName = parts[0];
            String genre = parts[1];

            if (!genreMap.containsKey(genre)) {
                genreMap.put(genre, new ArrayList<>());
            }
            genreMap.get(genre).add(songName);

        }
        return genreMap;
    }
}
