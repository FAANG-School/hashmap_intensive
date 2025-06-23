package com.school.faang.hashset.задача_4;

import java.util.HashMap;
import java.util.HashSet;

public class ChannelManager {

    private HashSet<String> members = new HashSet();

    private HashMap<String, String> memberRoles = new HashMap <>();

    public void addUser(String userId, String role)  {
        members.add(userId);
        memberRoles.put(userId, role);
    }

    public void removeUser(String userId) {
        members.remove(userId);
        memberRoles.remove(userId);
    }

    public String getRole(String userId) {

        if (memberRoles.containsKey(userId)) {
            return memberRoles.get(userId);

        } else {
            return "Не является участником";
        }
    }

    public boolean hasUser(String userId) {

        if (members.contains(userId))  {
            return true;
        }
        else {
            return false;
        }
    }

}
