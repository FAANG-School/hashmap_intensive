package com.school.faang.hashmap.задача_4;

import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class Solution {
    public static void main(String[] args) {
        List<String> songs = List.of("Bohemian Rhapsody - Rock", "Smells Like Teen Spirit - Rock", "Shape of You - Pop", "Blinding Lights - Pop", "Lose Yourself - Hip-Hop");

        Map<String, List<String>> songsMap = songs
            .stream()
            .map(song -> song.split(" - "))
            .collect(
                Collectors.groupingBy(
                    parts ->parts[1],
                    Collectors.mapping(
                        parts -> parts[0],
                            Collectors.toList()
                    )
                )
            );
        System.out.println(songsMap);
    }
}
