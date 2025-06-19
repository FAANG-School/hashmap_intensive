package com.school.faang.hashmap.задача_2;

public class Solution {
    public static void main(String[] args) {

        Manager manager = new Manager();

        manager.createUser(new User("vobla","Балбес Балбесович Вобла"));
        manager.createUser(new User("karas","Вениамин Степанович Карась"));
        manager.createUser(new User("lesh","Герман Аристархович Лещ"));
        manager.getAllUsers();




    }
}
