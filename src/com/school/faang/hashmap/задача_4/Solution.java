package com.school.faang.hashmap.задача_4;

import java.util.*;

public class Solution {

    private static List<String> music = Arrays.asList("Bohemian Rhapsody - Rock", "Smells Like Teen Spirit - Rock", "Shape of You - Pop", "Blinding Lights - Pop", "Lose Yourself - Hip-Hop");

    public static Map<String, List<String>> categorizeByGenre(List<String> list) {

        Map<String, List<String>> genreMap = new HashMap<>();

        for (String s : list) {
            String[] pair = s.split(" - ");
            String song = pair[0];
            String genre = pair[1];

            if (!genreMap.containsKey(genre)) {
                List<String> l = new ArrayList<>();
                l.add(song);
                genreMap.put(genre, l);
            } else {

                genreMap.get(genre).add(song);
            }

        }

        return genreMap;
    }

    public static void main(String[] args) {

        System.out.println(categorizeByGenre(music));

    }
}
