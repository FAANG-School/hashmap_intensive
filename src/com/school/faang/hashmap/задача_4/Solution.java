package com.school.faang.hashmap.задача_4;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Solution {
    public static void main(String[] args) {
        List<String> listOfSongs = new ArrayList<>();
        listOfSongs.add("Bohemian Rhapsody - Rock");
        listOfSongs.add("Smells Like Teen Spirit - Rock");
        listOfSongs.add("Shape of You - Pop");
        listOfSongs.add("Blinding Lights - Pop");
        listOfSongs.add("Lose Yourself - Hip-Hop");
        listOfSongs.add("Pump It - Hip-Hop");

        Solution solution = new Solution();
        Map<String, List<String>> result = new HashMap<>(solution.listOfGenre(listOfSongs));

        for (Map.Entry<String, List<String>> entry : result.entrySet()) {
            String genre = entry.getKey();
            List<String> songs = entry.getValue();

            System.out.println("Genre: " + genre + " Songs: " + songs );
        }
    }

    public Map<String, List<String>> listOfGenre(List<String> songs) {
        Map<String, List<String>> recommendations = new HashMap<>();

        for (String song : songs) {
            String genre = "";
            String songTitle = "".trim();

            for (int i = song.length() - 1; i > 0; i--) {
                char letter = song.charAt(i);

                if (!(letter == ' ')) {
                    genre = letter + genre;
                }else {
                    songTitle = song.substring(0, i - 2);
                    break;
                }
            }

            if (!recommendations.containsKey(genre)) {
                List<String> songsOfGenre = new ArrayList<>();
                songsOfGenre.add(songTitle);
                recommendations.put(genre, songsOfGenre);
            }else {
                recommendations.get(genre).add(songTitle);
            }
        }

        return recommendations;
    }
}
