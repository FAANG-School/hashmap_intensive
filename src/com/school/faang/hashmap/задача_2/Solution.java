package com.school.faang.hashmap.задача_2;

import java.util.HashMap;
import java.util.Map;

public class Solution {
    public static void main(String[] args) {

        Map<String, User> userDatabase = new HashMap<>();

        addUser(userDatabase, "elonmusk", 1, "Илон Маск", "2020-01-01");
        addUser(userDatabase, "zuck", 2, "Марк Цукерберг", "2019-05-15");
        addUser(userDatabase, "billgates", 3, "Билл Гейтс", "2021-03-10");
        addUser(userDatabase, "katyperry", 4, "Кэти Перри", "2022-07-22");

        // Попытка добавить существующего пользователя
        addUser(userDatabase, "elonmusk", 5, "Илон Маск Дубль", "2023-01-01");

        printAllUser(userDatabase);
    }

    static void printAllUser(Map<String, User> userDatabase) {

        System.out.println("\nВсе пользователи в базе Telegram: ");

        for (Map.Entry<String, User> entry : userDatabase.entrySet()) {
            String username = entry.getKey();
            User user = entry.getValue();
            System.out.println("Пользователь @" + username + ", полное имя: " + user.getFullName());
        }

    }

    static void addUser(Map<String, User> database, String username, long userId, String fullName, String registrationDate) {

        if (database.containsKey(username)) {
            System.out.println("Ошибка: Пользователь @" + username + " уже существует!");
        } else {
            database.put(username, new User(userId, fullName, registrationDate));
        }

    }
}
