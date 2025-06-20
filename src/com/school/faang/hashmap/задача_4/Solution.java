package com.school.faang.hashmap.задача_4;

import java.util.*;
public class Solution {
    public static void main(String[] args) {
List <String> NameMusicJanr = new ArrayList<String>();
NameMusicJanr.add("Bohemian Rhapsody - Rock");
NameMusicJanr.add("Smells Like Teen Spirit - Rock");
NameMusicJanr.add("Shape of You - Pop");
NameMusicJanr.add("Blinding Lights - Pop");
NameMusicJanr.add("Lose Yourself - Hip-Hop");
System.out.println(NameMusicJanr1(NameMusicJanr));

    }
    public static Map<String, List<String>> NameMusicJanr1(List<String> NameMusicJanr) {
        Map <String, List <String>> JanrMusic = new HashMap<>();
for (String str : NameMusicJanr) {
    if (!JanrMusic.containsKey(str.substring(str.indexOf("-")+1, str.length()))) {
        JanrMusic.put( str.substring(str.indexOf("-")+1, str.length()), new ArrayList<>());
        JanrMusic.get(str.substring(str.indexOf("-")+1, str.length())).add(str.substring(0, str.indexOf("-")-1));
    } else {
         JanrMusic.get(str.substring(str.indexOf("-")+1, str.length())).add(str.substring(0, str.indexOf("-")-1));
    }


}
        return JanrMusic;
    }
}
