package com.school.faang.hashmap.задача_2;

import java.time.LocalDate;

public class User {
    private static long countId = 1L;
    private final long userId;
    private final String fullName;
    private final String registrationDate;

    public User(String fullName) {
        this.userId = countId;
        this.fullName = fullName;
        this.registrationDate = LocalDate.now().toString();
        countId++;
    }

    public long getUserId() {
        return userId;
    }

    public String getRegistrationDate() {
        return registrationDate;
    }

    @Override
    public String toString() {
        return ", полное имя: " + fullName;
    }
}
