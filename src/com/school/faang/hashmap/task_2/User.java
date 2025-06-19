package com.school.faang.hashmap.task_2;

import java.time.LocalDateTime;
import java.util.Objects;

public class User {
    private final long userId;
    private final String fullName;
    private final  LocalDateTime registrationDate;

    public User(long userId, String fullName, LocalDateTime registrationDate) {
        this.userId = userId;
        this.fullName = fullName;
        this.registrationDate = registrationDate;
    }

    public String getFullName() {
        return fullName;
    }

    public LocalDateTime getRegistrationDate() {
        return registrationDate;
    }

    @Override
    public boolean equals(Object o) {
        if (o == null || getClass() != o.getClass()) return false;
        User user = (User) o;
        return userId == user.userId;
    }

    @Override
    public int hashCode() {
        return Objects.hashCode(userId);
    }
}
