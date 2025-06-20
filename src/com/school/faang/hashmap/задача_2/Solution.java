package com.school.faang.hashmap.задача_2;


import java.util.HashMap;

import java.util.Map;

class User{
    long usedId;
    String fullName;
    String registrationDate;

    public User(long usedId, String fullName, String registrationDate) {
        this.usedId = usedId;
        this.fullName = fullName;
        this.registrationDate = registrationDate;
    }
}
class DataBase{
    Map<String, User> users = new HashMap<>();
    void addUser(String username, User user){
        users.put(username, user);
    }
    void printUsers(){
        for (Map.Entry<String,User> count: users.entrySet()) {
            String username=count.getKey();
            String fullName = count.getValue().fullName;
            System.out.println("Пользователь @"+username+", полное имя: "+fullName);
        }
    }
}
public class Solution {
    public static void main(String[] args) {
        DataBase db = new DataBase();
        db.addUser("Alice2281", new User(235,"Alice", "12.03.2023"));
        db.addUser("Bob324", new User(657,"Bob", "21.01.2021"));
        db.addUser("Charlie324", new User(2134,"Charlie", "04.03.2022"));
        db.addUser("Natalya324", new User(346,"Natalya", "21.01.2021"));
        db.printUsers();
    }
}
