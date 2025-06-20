package com.school.faang.hashmap.задача_2;

import java.util.HashMap;
import java.util.Map;

public class Solution {

    private static final Map<String, User> userDatabase = new HashMap<>();

    public static void main(String[] args) {
        initUserDatabase();
        printInfo();
    }

    private static void addNewUser(String userName, User user) {
        userDatabase.putIfAbsent(userName, user);
    }

    private static void initUserDatabase() {
        addNewUser("@theBestIvan", new User(1L, "Ivan Ivanov", "04.09.2024"));
        addNewUser("@petrOne", new User(2L, "Petr Petrov", "12.03.2023"));
        addNewUser("@vladFAANG", new User(3L, "Vlad Mishustin", "25.06.2024"));
        addNewUser("@serega", new User(4L, "Sergey Kotov", "02.05.2024"));
    }

    private static void printInfo() {
        for (Map.Entry<String, User> userEntry : userDatabase.entrySet()) {
            System.out.println("Пользователь " + userEntry.getKey() + ", Полное имя: " + userEntry.getValue().getFullName());
        }
    }
}
