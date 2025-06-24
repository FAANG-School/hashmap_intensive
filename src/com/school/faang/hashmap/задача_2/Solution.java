package com.school.faang.hashmap.задача_2;

public class Solution {
    public static void main(String[] args) {
        UserManager manager = new UserManager();

        manager.addUser(new User(1, "Volodymyr Nemirniy", "22.06.2025"));
        manager.addUser(new User(2, "Alex Novakov", "18.04.2024"));
        manager.addUser(new User(3, "Nastya Mirnaya", "06.01.2022"));
        manager.addUser(new User(4, "Marina Bro", "08.08.2025"));

        manager.getUsers();
    }

    private record User(long userId, String fullName, String registrationDate) {
    }

    private static class UserManager {
        private final Map<String, User> users = new HashMap<>();

        public void addUser(User user) {
            users.put(user.fullName(), user);
        }

        public void getUsers() {
            for (Map.Entry<String, User> entry : users.entrySet()) {
                System.out.println("Пользователь @" + entry.getKey() + ", полное имя: " + entry.getValue().fullName());
            }
        }
    }
}
