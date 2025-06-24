package com.school.faang.hashset.задача_4;

import java.util.HashMap;
import java.util.HashSet;

public class ChannelManager {

    private HashSet<String> members;

    private HashMap<String, String> memberRoles;

    public ChannelManager(HashSet<String> members, HashMap<String, String> memberRoles) {
        this.members = members;
        this.memberRoles = memberRoles;
    }

    protected void addUser(String userId, String role) {
        members.add(userId);
        memberRoles.putIfAbsent(userId, role);
    }

    protected void removeUser(String userId) {
        members.remove(userId);
        memberRoles.remove(userId);
    }

    protected String getRole(String userId) {
        return memberRoles.getOrDefault(userId, "Данный пользователь не является участником.");
    }

    protected boolean hasUser(String userId) {
        return members.contains(userId);
    }
}
