package com.school.faang.hashmap.задача_2;

import java.util.Objects;

public class User {

    private final long userID;

    private final String fullName;

    private final String registrationDate;


    public User(long userID, String fullName, String registrationDate) {
        this.userID = userID;
        this.fullName = fullName;
        this.registrationDate = registrationDate;
    }

    public long getUserID() {
        return userID;
    }

    @Override
    public int hashCode() {
        return Objects.hashCode(userID);
    }

    @Override
    public boolean equals(Object oth) {
        if (!(oth instanceof User)) {
            return false;
        }
        return ((User) oth).userID == userID;
    }

    @Override
    public String toString() {
        return "Пользователь @" + this.userID + ", полное имя: " + fullName;
    }
}
