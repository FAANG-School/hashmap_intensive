package com.school.faang.hashmap.задача_2;

import java.util.HashMap;
import java.util.Map;

public class UserManager {
    Map<String, User> userBd;

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

    public Map<String, User> getUserBd() {
        return userBd;
    }
}
