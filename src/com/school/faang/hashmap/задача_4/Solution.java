package com.school.faang.hashmap.задача_4;

public class Solution {
    public static void main(String[] args) {
        List<String> lists = new ArrayList<>(
                List.of(
                        "Bohemian Rhapsody - Rock",
                        "Smells Like Teen Spirit - Rock",
                        "Shape of You - Pop",
                        "Blinding Lights - Pop",
                        "The - Hills - Pop",
                        "Lose Yourself - Hip-Hop"
                )
        );

        Map<String, List<String>> listMap = new HashMap<>();

        for (String list : lists) {
            int lastSpaceIndex = list.lastIndexOf(" - ");

            if (lastSpaceIndex == -1) {
                System.out.println("Last word: " + list);
            } else {
                String name = list.substring(0, lastSpaceIndex);
                String genre = list.substring(lastSpaceIndex + 3);

                if (listMap.containsKey(genre)) {
                    listMap.get(genre).add(name);
                } else {
                    List<String> songs = new ArrayList<>();
                    songs.add(name);

                    listMap.put(genre, songs);
                }
            }
        }

        for (Map.Entry<String, List<String>> entry : listMap.entrySet()) {
            System.out.println(entry.getKey() + ": " + entry.getValue());
        }
    }
}
