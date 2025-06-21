package com.school.faang.hashmap.задача_5;

import java.util.*;

public class Solution {
    public static void main(String[] args) {
        Map<String, Integer> map = new HashMap<>();
        String text = """
        Lorem Ipsum is simply dummy text of the printing and typesetting industry. 
        Lorem Ipsum has been the industry's standard dummy text ever since the 1500s,
        when an unknown printer took a galley of type and scrambled it to make a type specimen book.
        It has survived not only five centuries, but also the leap into electronic typesetting, remaining essentially unchanged.
        It was popularised in the 1960s with the release of Letraset sheets containing Lorem Ipsum passages, 
        and more recently with desktop publishing software like Aldus PageMaker including versions of Lorem Ipsum.
        """;

        String lowerText = text.toLowerCase().replaceAll("[^a-zA-Zа-яА-Я ]", " ");
        String words[] = lowerText.split(" ");
        System.out.println(lowerText);
        for(String word : words){
            if(!word.isEmpty() && word.length() != 0){
                map.putIfAbsent(word, 1);
                map.put(word, map.get(word) + 1);
            }
        }

        for(Map.Entry<String, Integer> entry : map.entrySet()){
            if(entry.getValue() >= 5) {
                System.out.println(entry.getKey() + " : " + entry.getValue());
            }
        }
    }
}
