package com.school.faang.hashset.задача_2;

import java.util.Set;
import java.util.HashSet;

public class UserBlackList {

    private final Set<String> blackList;

    public UserBlackList() {
        blackList = new HashSet<>();
    }

    public void blockUser(String username) {
        blackList.add(username);
    }

    public void unblockUser(String username) {
        if (username == null) {
            return;
        }
        blackList.remove(username);
    }

    public boolean isUserBlocked(String username) {
        return blackList.contains(username);
    }
}
