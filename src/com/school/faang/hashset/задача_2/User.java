package com.school.faang.hashset.задача_2;

public class User {

    private String username;

    private final UserBlackList userBlackList;

    private boolean isUserBlocked;

    public User(String username) {
        this.username = username;
        userBlackList = new UserBlackList();
        isUserBlocked = false;
    }

    public String getUsername() {
        return username;
    }

    public void blockUser(String username) {
        if (username == null) {
            isUserBlocked = true;
            return;
        }
        userBlackList.blockUser(username);
    }

    public void blockUser(User user) {
        if (user == null) {
            isUserBlocked = true;
            return;
        }
        blockUser(user.toString());
    }

    public void unblockUser(String username) {
        if (username == null) {
            isUserBlocked = false;
            return;
        }
        userBlackList.unblockUser(username);
    }

    public void unblockUser(User user) {
        if (user == null) {
            isUserBlocked = false;
            return;
        }
        userBlackList.unblockUser(user.toString());
    }

    public boolean isUserBlocked(String username) {
        return userBlackList.isUserBlocked(username);
    }

    public boolean isUserBlocked(User user) {
        return isUserBlocked(user.toString());
    }

    public boolean amIBlocked() {
        return isUserBlocked;
    }

    @Override
    public String toString() {
        return username;
    }
}
