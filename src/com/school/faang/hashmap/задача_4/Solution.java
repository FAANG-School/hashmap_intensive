package com.school.faang.hashmap.задача_4;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

public class Solution {
    public static void main(String[] args) {
        Manager manager = new Manager();

        List<String> songsList =new ArrayList<>(List.of("Bohemian Rhapsody - Rock", "Smells Like Teen Spirit - Rock",
                "Shape of You - Pop","Blinding Lights - Pop","Lose Yourself - Hip-Hop"));

        Map<String, List<String>> sortedSongs = manager.getMap(songsList);
        for (Map.Entry<String, List<String>> song: sortedSongs.entrySet()) {
            String genre = song.getKey();
            List<String> songs = song.getValue();

            System.out.println("Жанр: " + genre + ". список песен: "+ songs.toString());
        }
    }

}
