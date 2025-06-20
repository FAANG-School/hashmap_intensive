package com.school.faang.hashmap.task_4;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class MusicGenreClassifier {

    private final Map<String, List<String>> musicByGenre = new HashMap<>();

    public void sortByGenre(List<String> songs) {
        for (String song : songs) {
            String[] parts = song.split("\\s*-\\s*");

            if (parts.length == 2) {
                if (!musicByGenre.containsKey(parts[1])) {
                    musicByGenre.put(parts[1], new ArrayList<>());
                }
                musicByGenre.get(parts[1]).add(parts[0]);
            }

        }
    }

    public void showAllSongs() {
        for (Map.Entry<String, List<String>> entry : musicByGenre.entrySet()) {
            System.out.println("Music genres - " + entry.getKey());
            for (String song : entry.getValue()) {
                System.out.println(" - " + song);
            }
        }
    }
}
