package com.school.faang.hashmap.задача_2;

import java.util.HashMap;
import java.util.Map;

public class Solution {
    public static void main(String[] args) {
        var pirozhkov228 = new User(1234878712367L, "Петька Василискин", "1999/12/10");
        var vasya332 = new User(1234878712367L, "Вася Колбаскин", "1990/1/30");
        var TheBest = new User(1234878712367L, "Василиса стручкова", "1989/6/17");
        var Vodalas = new User(1234878712367L, "Дима Вадалас", "2004/7/10");
        Map<String, User> users = new HashMap<>();
        users.put("PIROZHOK", pirozhkov228);
        users.put("VASYA", vasya332);
        users.put("THEBEST", TheBest);
        users.put("VODaLAS", Vodalas);

        for (Map.Entry<String, User> entry : users.entrySet()) {
            System.out.println("Пользователь @" + entry.getKey() + ", полное имя: " + entry.getValue().getFullName());
        }
    }
}
