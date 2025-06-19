package com.school.faang.hashmap.задача_2;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.HashMap;
import java.util.Map;

public class Manager {
    private final Map<String,User> users = new HashMap<>();
    long countId = 1;
    public long generateId() {
        return countId++;
    }
    public void createUser(User user) {

        long id = generateId();
        user.setUserId(id);
        user.setRegistrationDate(LocalDateTime.now().format(DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm:ss")));
        String nick = user.getNickName();
        if (users.get(nick) == null) {
            users.put(nick,user);
        } else {
            System.out.println("Пользователь с таким ником существует");
        }
    }
    public void getAllUsers() {
        for(Map.Entry<String, User> user : users.entrySet()) {
            String nickName = user.getKey();
            String fullName = user.getValue().getFullName();

            System.out.println("Пользователь: @" + nickName +" полное имя: " + fullName);
        }
    }

}
