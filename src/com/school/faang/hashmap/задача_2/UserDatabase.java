package com.school.faang.hashmap.задача_2;

import java.util.HashMap;
import java.util.Map;

public class UserDatabase {
  private final Map<String, User> userMap = new HashMap<>();

  public void addUser(String username, User user) {
    userMap.put(username, user);
  }

  public void printUsers() {
    for (Map.Entry<String, User> entry : userMap.entrySet()) {
      String username = entry.getKey();
      String fullName = entry.getValue().getFullName();
      System.out.println("Пользователь " + username + ", полное имя: " + fullName);
    }
  }
}
