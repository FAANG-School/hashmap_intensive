package com.school.faang.hashmap.задача_2;

import java.util.Objects;

public class User {

    private final Long userId;

    private String fullName;

    private final String registrationDate;

    public User(Long userId, String fullName, String registrationDate) {
        this.userId = userId;
        this.fullName = fullName;
        this.registrationDate = registrationDate;
    }

    public Long getUserId() {
        return userId;
    }

    public String getFullName() {
        return fullName;
    }

    public String getRegistrationDate() {
        return registrationDate;
    }

    public void setFullName(String fullName) {
        this.fullName = fullName;
    }

    @Override
    public String toString() {
        return "User{" +
                "userId=" + userId +
                ", fullName='" + fullName + '\'' +
                ", registrationDate='" + registrationDate + '\'' +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (o == null || getClass() != o.getClass()) return false;
        User user = (User) o;
        return Objects.equals(userId, user.userId);
    }

    @Override
    public int hashCode() {
        return Objects.hashCode(userId);
    }
}
