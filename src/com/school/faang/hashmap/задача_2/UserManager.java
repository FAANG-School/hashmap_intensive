package com.school.faang.hashmap.задача_2;

import java.util.HashMap;

public class UserManager {
    HashMap<String, User> userBd;

    public UserManager() {
        this.userBd = new HashMap<>();
    }

    public void setUser(String nickName, User user) {
        if(!userBd.containsKey(nickName)) {
            userBd.put(nickName, user);
        }
    }

    public String getUserName(String nickName) {
        if(userBd.containsKey(nickName)) {
            return userBd.get(nickName).getFullName();
        }
        return "пользователь не найден";
    }

    public HashMap<String, User> getUserBd() {
        return userBd;
    }
}
