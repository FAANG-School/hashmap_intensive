package com.school.faang.hashmap.task_4;

import java.util.List;

public class Solution {
    public static void main(String[] args) {
        List<String> songs = List.of("Bohemian Rhapsody - Rock", "Smells Like Teen Spirit - Rock", "Shape of You - Pop",
                "Blinding Lights - Pop", "Lose Yourself - Hip-Hop");

        MusicGenreClassifier musicGenreClassifier = new MusicGenreClassifier();
        musicGenreClassifier.sortByGenre(songs);
        musicGenreClassifier.showAllSongs();
    }
}
