package com.school.faang.hashmap.задача_2;
import java.util.*;
public class User {
      long userId;
     String fullName;
     String registrationDate;

    public User( long userId,String fullName, String registrationDate) {
        
        this.userId = userId;
        this.fullName = fullName;
        this.registrationDate = registrationDate;
    }

    public String getFullName() {
        return "ID:" + userId + " Полное имя:" + fullName + " Дата регистрации:" + registrationDate;
    }
}
