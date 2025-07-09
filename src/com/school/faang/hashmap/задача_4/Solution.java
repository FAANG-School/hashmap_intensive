package com.school.faang.hashmap.задача_4;

import java.util.*;

public class Solution {
    public static void main(String[] args) {


        List<String> songs = Arrays.asList(
                "Bohemian Rhapsody - Rock",
                "Smells Like Teen Spirit - Rock",
                "Shape of You - Pop",
                "Blinding Lights - Pop",
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

    private static Map<String, List<String>> groupSongsByGenre(List<String> songs) {

        final String DELIMITER = " - ";
        final int DELIMITER_NOT_FOUND = -1;

        Map<String, List<String>> genreMap = new HashMap<>();

        for (String song : songs) {
            int lastDelimiterIndex = song.lastIndexOf(DELIMITER);

            if (lastDelimiterIndex == DELIMITER_NOT_FOUND) {
                continue;
            }

            String songTitle = song.substring(0, lastDelimiterIndex).trim();
            String genre = song.substring(lastDelimiterIndex + DELIMITER.length()).trim();

            genreMap.computeIfAbsent(genre, k -> new ArrayList<>()).add(songTitle);
        }
        return genreMap;
    }
}