package com.school.faang.hashmap.задача_2;

public class Solution {
  public static void main(String[] args) {
    UserDatabase db = new UserDatabase();

    db.addUser("@user1", new User(1, "User 1", "2023-09-10"));
    db.addUser("@user2", new User(2, "User 2", "2023-08-15"));
    db.addUser("@user3", new User(3, "User 3", "2025-03-20"));
    db.addUser("@user4", new User(4, "User 4", "2029-04-25"));

    db.printUsers();
  }
}
