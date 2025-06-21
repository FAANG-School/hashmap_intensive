package com.school.faang.hashmap.задача_2;

import java.time.LocalDate;
import java.util.HashMap;
import java.util.Map;
import java.util.Random;

class User {

    long userId;
    String fullName;
    String registrationDate;

    public User(long userId, String fullName, String registrationDate) {
        this.fullName = fullName;
        this.registrationDate = registrationDate;
        this.userId = userId;
    }

    public String getFullName() {
        return fullName;
    }

    public long getUserId() {
        return userId;
    }
}
public class Solution {

    public static void addUser(String name, Map<String, User> users) {
        LocalDate currentDate = LocalDate.now();
        Random random = new Random();
        String id = "@" + name;
        String date = currentDate.toString();

        users.put(id, new User(random.nextLong(1000), name, date));
    }
    public static void main(String[] args) {

        Map<String, User> userDatabase = new HashMap<>();

        addUser("Misha", userDatabase);
        addUser("Vasya", userDatabase);
        addUser("Petya", userDatabase);
        addUser("Gosha", userDatabase);
        addUser("Murka", userDatabase);

        for (Map.Entry<String, User> entry : userDatabase.entrySet()) {

            String username = entry.getKey();

            User user = entry.getValue();

            System.out.println("Пользователь: ID: " + user.getUserId() + " никнейм: " + username + ", полное имя: " + user.getFullName());

        }

    }
}
