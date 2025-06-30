package com.school.faang.hashmap.задача_2;

public class Solution {
    public static void main(String[] args) {
        UserDatabase userDatabase = new UserDatabase();

        User user1 = new User(1L, "Иван Иванов", "2023-01-15");
        User user2 = new User(2L, "Петр Петров", "2023-02-20");
        User user3 = new User(3L, "Мария Сидорова", "2023-03-10");
        User user4 = new User(4L, "Анна Кузнецова", "2023-04-05");

        userDatabase.addUser(user1);
        userDatabase.addUser(user2);
        userDatabase.addUser(user3);
        userDatabase.addUser(user4);

        userDatabase.printAllUsersFormatted();
    }
}
