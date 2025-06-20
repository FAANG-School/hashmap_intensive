package com.school.faang.hashmap.задача_4;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Solution {
    public static void main(String[] args) {
        Solution solution = new Solution();
        Map<String, List<String>> playlist = solution.addMusic(List.of(
                "Bohemian Rhapsody - Rock",
                "Smells Like Teen Spirit - Rock",
                "Shape of You - Pop",
                "Blinding Lights - Pop",
                "Lose Yourself - Hip-Hop"
        ));

        System.out.println(playlist.get("Rock"));
        System.out.println(playlist.get("Pop"));
        System.out.println(playlist.get("Hip-Hop"));
    }

    public Map<String, List<String>> addMusic(List<String>songList) {
        Map<String, List<String>> playlist= new HashMap<>();

        for(String song: songList) {
            String genre = song.split(" - ")[1].trim();
            String songName = song.split(" - ")[0].trim();

            if(!playlist.containsKey(genre))
                playlist.put(genre, new ArrayList<>());

            playlist.get(genre).add(songName);

        }

        return playlist;
    }
}
