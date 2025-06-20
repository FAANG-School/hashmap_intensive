package com.school.faang.hashmap.задача_2;

import java.time.LocalDate;
import java.util.HashMap;
import java.util.Map;
import java.util.Random;

public class Solution {

    private final Map<String, User> users = new HashMap<>();
    public static void main(String[] args) {
        Solution solution = new Solution();
        solution.registerUser("user111", "JonDoe");
        solution.registerUser("user122", "JaneDoe");
        solution.registerUser("user111", "TestUser");

        System.out.println(solution.findUser("user122"));
    }

    public void registerUser(String userName, String fullName) {
        if(users.containsKey(userName)) {
            System.out.println("Пользователь с таким именем уже существует");
            return;
        }
        long userId = generateId();
        User user  = new User(userId, fullName, LocalDate.now().toString());
        users.put(userName, user);
    }

    private long generateId() {
        Random random = new Random();
        return random.nextInt(9000) + 1000;
    }

    private User findUser(String userName) {
        return users.get(userName);
    }
}
