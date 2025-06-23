package com.school.faang.hashmap.задача_5;

import java.sql.SQLOutput;
import java.util.HashMap;
import java.util.Map;

public class Solution {

    static String text = "…Очень хорошо, что ты себя чувствуешь совсем счастливой, но ты знаешь, что я не особенно верю в счастье. И в несчастье тоже. И то и другое бывает только в спектаклях, в кино и в книжках, а в жизни ничего этого на самом деле нет. Верю я в то, что человек живет так, как сам того заслуживает (по своим талантам и качествам), а если не делать  того, что нужно, то приходится расплачиваться за это, и не просто, а вдвойне.";
    //static String lowerText = text.toLowerCase();
    //static String noPunctuationText = lowerText.replaceAll("[^a-zA-Zа-яА-Я ]", "");
    //static String[] cleanedText = noPunctuationText.split(" ");
    //public static Map<String, Integer> words = new HashMap<>();

    public static Map<String, Integer> countWordFrequency(String text) {
        String lowerText = text.toLowerCase();
        String noPunctuationText = lowerText.replaceAll("[^a-zA-Zа-яА-Я ]", "");
        String[] cleanedText = noPunctuationText.split(" ");

        Map<String, Integer> words = new HashMap<>();

        for (String s : cleanedText) {
            if (!words.containsKey(s)) {
                words.put(s, 1);
            } else {
                int currentValue = words.get(s);
                words.put(s, currentValue + 1);
            }
        }

            return words;
    }


    public static void main(String[] args) {


        Map<String, Integer> words = countWordFrequency(text);


        for(Map.Entry<String, Integer> entry : words.entrySet()){
            if(entry.getValue() >= 5){
                System.out.println(entry.getKey() + " " + entry.getValue());
            }
        }

    }

}


