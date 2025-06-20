package com.school.faang.hashmap.задача_2;

import java.util.HashMap;
import java.util.Map;

public class Solution {

    private static final Map<String, User> accounts = new HashMap<>();

    public static void main(String[] args) {
        addUser("testUser1", new User("First Test User"));
        addUser("testUser2", new User("Second Test User"));
        addUser("testUser3", new User("Third Test User"));
        addUser("testUser4", new User("Fourth Test User"));

        getAllUsers();
    }

    private static void addUser(String username, User info) {
        accounts.put(username, info);
    }

    private static void getAllUsers() {
        accounts.forEach((s, user) -> System.out.println("Пользователь @" + s + user));
    }
}
