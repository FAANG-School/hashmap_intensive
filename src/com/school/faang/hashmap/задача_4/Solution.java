package com.school.faang.hashmap.задача_4;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Solution {
    private static final List<String> tracks = new ArrayList<>();

    static {
        tracks.add("Bohemian Rhapsody - Rock");
        tracks.add("Smells Like Teen Spirit - Rock");
        tracks.add("Shape of You - Pop");
        tracks.add("Blinding Lights - Pop");
        tracks.add("Lose Yourself - Hip-Hop");
    }

    public static void main(String[] args) {
        Map<String, List<String>> tracksByGenres = mapTracksByGenres(tracks);
        System.out.println(tracksByGenres);
    }

    static Map<String, List<String>> mapTracksByGenres(List<String> tracks) {
        Map<String, List<String>> result = new HashMap<>();

        tracks.forEach(e -> {
                    String[] line = e.split(" - ", 2);
                    result.putIfAbsent(line[1], new ArrayList<>());
                    result.get(line[1]).add(line[0]);
                });
        return result;
    }
}
