package com.school.faang.hashmap.задача_2;

public class User {
    private long userId;
    private String fullName;
    private String nickName;
    private String registrationDate;

    public User(String nickname, String fullName) {
        this.fullName = fullName;
        this.nickName = nickname;
    }


    public String getNickName() {
        return nickName;
    }

    public String getFullName() {
        return fullName;
    }

    public void setUserId(long userId) {
        this.userId = userId;
    }

    public void setRegistrationDate(String registrationDate) {
        this.registrationDate = registrationDate;
    }
}
