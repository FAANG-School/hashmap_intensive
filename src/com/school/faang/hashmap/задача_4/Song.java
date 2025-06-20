package com.school.faang.hashmap.задача_4;

import java.util.*;

public class Song {

    private final String name;

    private final String genre;

    private Song(String name, String genre) {
        this.name = name;
        this.genre = genre;
    }

    public static Song getSong(String unparsed) {
        StringBuilder nameBuilder = new StringBuilder();
        StringBuilder genreBuilder = new StringBuilder();
        boolean stopped = false;
        for (char c : unparsed.toCharArray()) {
            if (stopped) {
                genreBuilder.append(c);
                continue;
            }
            if (c == '-') {
                stopped = true;
            }
            else {
                nameBuilder.append(c);
            }
        }
        return new Song(nameBuilder.toString().trim(), genreBuilder.toString().trim());
    }

    public String getName() {
        return name;
    }

    public String getGenre() {
        return genre;
    }
}
