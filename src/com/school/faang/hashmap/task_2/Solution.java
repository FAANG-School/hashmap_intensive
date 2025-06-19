package com.school.faang.hashmap.task_2;

import java.time.LocalDateTime;

public class Solution {
    public static void main(String[] args) {
        DateBaseAddUser dateBaseAddUser = new DateBaseAddUser();
        dateBaseAddUser.add("user1", new User(1L, "Vitalijus", LocalDateTime.now()));
        dateBaseAddUser.add("user2", new User(2L, "Vitalijus", LocalDateTime.now()));
        dateBaseAddUser.add("user3", new User(3L, "Vitalijus", LocalDateTime.now()));
        dateBaseAddUser.add("user4", new User(4L, "Vlad", LocalDateTime.now()));

        dateBaseAddUser.showAllUsers();
    }
}
