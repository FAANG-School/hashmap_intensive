package com.school.faang.hashmap.задача_2;

import java.util.HashMap;
import java.util.Map;

public class Solution {
    public static void main(String[] args) {
        Map<String, User> map = new HashMap<>();

        map.put("@user1", new User(1, "Alex", "1999-01-01"));
        map.put("@user2", new User(1, "Andrew", "1999-01-02"));
        map.put("@user3", new User(1, "Vlad", "1999-01-03"));
        map.put("@user4", new User(1, "John", "1999-01-04"));

        for (Map.Entry<String, User> entry: map.entrySet()) {
            System.out.println("Пользователь " + entry.getKey() + ", полное имя: " + entry.getValue().fullName);
        }

    }
}
