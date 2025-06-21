package com.school.faang.hashmap.задача_5;

import java.util.HashMap;
import java.util.Map;

public class Solution {
    public static void main(String[] args) {

        String string = "Возьми какой-нибудь текст (можно скопировать пару абзацев из любой статьи в интернете) и сохрани его в поле типа String." +

                "Обработай этот текст:" +

                "Приведи все к нижнему регистру, чтобы \"Слово\" и \"слово\" считались одним и тем же." +

                "Удали все знаки препинания (точки, запятые и т.д.), оставив только буквы и пробелы." +

                "Разбей очищенный текст на массив отдельных слов." +

                "Используй Map для подсчета частоты каждого слова." +

                "После подсчета, перебери получившуюся карту и выведи в консоль только те слова, у которых количество больше 5, вместе с их частотой.";


        string =string.toLowerCase();
        string = string.replaceAll("[^а-яА-Я ]", "");
        String[] array =string.split("\\s+");
        Map<String,Integer> map = new HashMap<>();
        for (String value : array) {
            map.put(value, map.getOrDefault(value, 0) + 1);
        }
        for(Map.Entry<String,Integer> s:map.entrySet()){
            if(s.getValue()>5){
                System.out.println(s.getKey() +":" + s.getValue());
            }
        }

    }
}
