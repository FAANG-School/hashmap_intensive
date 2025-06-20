package com.school.faang.hashmap.задача_2;

public class User {
    private long userId;
    private String fullName;
    private String registrationDate;

    private static long lastAddingId;

    public User(long userId, String fullName, String registrationDate) {
        this.userId = userId;
        this.fullName = fullName;
        this.registrationDate = registrationDate;
    }

    public String getFullName() {
        return fullName;
    }

    public static long getLastAddingId() {
        return ++lastAddingId;
    }
}
