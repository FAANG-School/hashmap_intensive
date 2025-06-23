package com.school.faang.hashmap.задача_4;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Solution {

    static Map songsListOfGenres(List<String> songs) {
        Map<String, List<String>> genreMap = new HashMap<>();

        for (String song : songs) {
            String[] array = song.split(" - ");
            String genre = array[1];
            String songTitle = array[0];

            if (!genreMap.containsKey(genre)) {
                List<String> genreList = new ArrayList<>();
                genreMap.put(genre, genreList);
            }
            genreMap.get(genre).add(songTitle);
            //genreMap.get(genre).add(songTitle);
        }

        return genreMap;
    }
    public static void main(String[] args) {

        List<String> songsOfGenre = new ArrayList<>();
        songsOfGenre.add("Bohemian Rhapsody - Rock");
        songsOfGenre.add("Smells Like Teen Spirit - Rock");
        songsOfGenre.add("Shape of You - Pop");
        songsOfGenre.add("Blinding Lights - Pop");
        songsOfGenre.add("Lose Yourself - Hip-Hop");

        Map<String, List<String>> map = songsListOfGenres(songsOfGenre);

        System.out.println("Жанр Rock: " + map.get("Rock"));
        System.out.println("Жанр Pop: " + map.get("Pop"));
        System.out.println("Жанр Hip-Hop: " + map.get("Hip-Hop"));

    }
}
