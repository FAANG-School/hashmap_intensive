package com.school.faang.hashmap.задача_2;

public class User {
    long userId;
    String fullName;
    String registrationDate;

    User(long userId, String fullName, String registrationDate) {
        this.userId = userId;
        this.fullName = fullName;
        this.registrationDate = registrationDate;
    }

    public String getFullName() {
        return fullName;
    }
}