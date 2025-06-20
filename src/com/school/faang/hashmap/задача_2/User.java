package com.school.faang.hashmap.задача_2;

public class User {
    private long userId;
    private String fullName;
    private String registrationDate;

    public User(long userId, String fullName, String registrationDate) {
        this.userId = userId;
        this.fullName = fullName;
        this.registrationDate = registrationDate;
    }

    public long getUserId() {
        return userId;
    }

    public String getFullName() {
        return fullName;
    }

    public String getRegistrationDate() {
        return registrationDate;
    }
}
