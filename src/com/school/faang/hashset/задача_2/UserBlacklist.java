package com.school.faang.hashset.задача_2;
import java.util.HashSet;
public class UserBlacklist {

    private HashSet<String> blockedUsers = new HashSet <>();
public void blockUser(String username)  {
    if (!blockedUsers.contains(username)) {
        blockedUsers.add(username);

    }
}
public void unblockUser(String username)  {
    if (blockedUsers.contains(username)) {
        blockedUsers.remove(username);

    }
}
public boolean isUserBlocked(String username) {
    if (blockedUsers.contains(username)) {
        return true;

    } else {
        return false;
    }
}

}
