package com.school.faang.hashmap.задача_2;

public class Solution {
    public static void main(String[] args) {
        UserBase userBase = new UserBase();
        userBase.addUser(new User(1, "Vlad Mishustin", "20.06.2025"));
        userBase.addUser(new User(2, "Inna Mishustina", "20.06.2025"));
        userBase.addUser(new User(25, "Mikhail Gribakin", "20.06.2025"));
        for (var entry : userBase.getAllUsers()) {
            System.out.println(entry.getValue());
        }
    }
}
