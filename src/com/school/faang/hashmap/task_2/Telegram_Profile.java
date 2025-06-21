package com.school.faang.hashmap.task_2;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class Telegram_Profile {
    private Map<String, User> user_profiles = new HashMap<>();

    public void addUser(String username, User user){
        user_profiles.put(username, user);
        System.out.println("User added: " + username);
    }

    public void printAllUsers(){
        System.out.println("List Users");
        Set<String> usernames = user_profiles.keySet();

        for (String username : usernames){
            User user = user_profiles.get(username);
            System.out.println("User " + username + ", full name: " + user.getFullName());
        }
    }

    public static void main(String[] args){
        System.out.println("Profile storage:");

        Telegram_Profile storage = new Telegram_Profile();
        User user_1 = new User(952L, "Alexey Sokolov", "20.06.2025");
        storage.addUser("@alex_sokolov", user_1);

        User user2 = new User(1102L, "Elena Petrova", "19.01.2023");
        storage.addUser("@elena_petrova", user2);

        User user3 = new User(1043L, "Ivan Kyznetsov", "05.12.2023");
        storage.addUser("@ivan_kuz", user3);

        User user4 = new User(2004L, "Marya Vasilevna", "19.01.2017");
        storage.addUser("@mary_v", user4);

        String searchUsername = "@alex_sokolov";
        if (storage.user_profiles.containsKey(searchUsername)){
            User foundUser = storage.user_profiles.get(searchUsername);
            System.out.println("A user has been found: " + foundUser.getFullName() + " (ID: " + foundUser.getUserId() + ")");
        } else {
            System.out.println("User @" + searchUsername + " не найден.");
        }
        storage.printAllUsers();
    }
}

