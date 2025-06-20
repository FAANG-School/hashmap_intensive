package com.school.faang.hashmap.задача_4;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Solution {
    private static Map<String, List<String>> groupingMusic(List<String> songs) {
        Map<String, List<String>> groups = new HashMap<>();

        songs.stream().forEach(song -> {
            String[] array = song.split(" - ");
            groups.putIfAbsent(array[1], groups.getOrDefault(array[1], new ArrayList<>()));
            groups.getOrDefault(array[1], new ArrayList<>()).add(array[0]);
        });

        return groups;
    }

    public static void main(String[] args) {
        List<String> songs = new ArrayList<>() {{
            add("Bohemian Rhapsody - Rock");
            add("Smells Like Teen Spirit - Rock");
            add("Shape of You - Pop");
            add("Blinding Lights - Pop");
            add("Lose Yourself - Hip-Hop");
        }};

        for (Map.Entry<String, List<String>> entry : groupingMusic(songs).entrySet()) {
            System.out.println(entry.getKey() + " : " + entry.getValue());
        }
    }
}
