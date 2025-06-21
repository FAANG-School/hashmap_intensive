package com.school.faang.hashmap.задача_4;

import java.util.*;

public class Solution {
    List<String> songs = new ArrayList<>(Arrays.asList("Never gonna give you up - Dance-pop","Bohemian Rhapsody - Rock", "Smells Like Teen Spirit - Rock", "Shape of You - Pop", "Blinding Lights - Pop", "Lose Yourself - Hip-Hop"));

    private Map<String, List> genreMap;

    public Solution() {
        genreMap = new HashMap<>();
    }

    public void addSongs(List<String> songs) {
        for (String song : songs) {
            String[] genreAndSong = song.split(" - ");
            if (!genreMap.containsKey(genreAndSong[1])) {
                genreMap.put(genreAndSong[1], new ArrayList<>(Arrays.asList(genreAndSong[0])));
            }
            else {
                genreMap.get(genreAndSong[1]).add(genreAndSong[0]);
            }
        }
    }

    public static void main(String[] args) {
        Solution solution = new Solution();
        solution.addSongs(solution.songs);
        System.out.println(solution.genreMap);
    }
}
