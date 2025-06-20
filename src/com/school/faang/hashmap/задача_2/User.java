package com.school.faang.hashmap.задача_2;

import java.time.LocalDate;

public class User {
    private final long userId;
    private final String fullName;
    private final String registrationDate;

    public User(long userId, String fullName, String registrationDate) {
        this.userId = userId;
        this.fullName = fullName;
        this.registrationDate = registrationDate;
    }

    public String getRegistrationDate() {
        return registrationDate;
    }
    public String getFullName() {
        return fullName;
    }
    public long getUserId() {
        return userId;
    }

    @Override
    public String toString() {
        return "User{" +
                "userId=" + userId +
                ", fullName='" + fullName + '\'' +
                ", registrationDate='" + registrationDate + '\'' +
                '}';
    }
}
