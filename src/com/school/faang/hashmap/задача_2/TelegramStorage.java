package com.school.faang.hashmap.задача_2;

import java.time.LocalDateTime;
import java.util.HashMap;
import java.util.Map;

public class TelegramStorage {
    private Map<String, User> users = new HashMap<>();


    public void addUser(String username, String fullName){
        if(!users.containsKey(username)){
            users.put(username, new User(User.getLastAddingId(), fullName, LocalDateTime.now().toString()));
            return;
        }
        System.out.println("Username " + username + " для пользователя '" + fullName + "' уже занят");
    }

    public void getUsers(){
        for (Map.Entry<String, User> entry : users.entrySet()) {
            System.out.println("Пользователь @" + entry.getKey() + ", полное имя: " + entry.getValue().getFullName());
        }
    }
}
