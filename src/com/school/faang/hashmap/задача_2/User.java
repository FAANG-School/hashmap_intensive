package com.school.faang.hashmap.задача_2;

import java.util.Objects;

public class User {
    private final long userId;
    private final String fullName;
    private final String registrationDate;

    public User(long userId, String fullName, String registrationDate) {
        this.userId = userId;
        this.fullName = fullName;
        this.registrationDate = registrationDate;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (obj == null || getClass() != obj.getClass()) return false;
        User user = (User) obj;
        return userId == user.userId
                && Objects.equals(fullName, user.fullName)
                && Objects.equals(registrationDate, user.registrationDate);
    }

    @Override
    public int hashCode() {
        return Objects.hash(userId, fullName, registrationDate);
    }

    @Override
    public String toString() {
        return fullName;
    }
}
