package com.school.faang.hashset.задача_2;

import java.util.HashSet;

public class UserBlacklist {

    private HashSet<String> blacklist = new HashSet<>();

    void blockUser(String username) {

        blacklist.add(username);

    }

    void unblockUser(String username) {

        blacklist.remove(username);

    }

    boolean isUserBlocked(String username) {

        return blacklist.contains(username);

    }


    @Override
    public String toString() {

        return "UserBlacklist{" +
                "blacklist=" + blacklist +
                '}';

    }
}
