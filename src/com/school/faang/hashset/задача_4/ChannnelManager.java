package com.school.faang.hashset.задача_4;

import java.util.Set;
import java.util.HashSet;
import java.util.HashMap;
import java.util.Map;

public class ChannnelManager {

    private final Set<String> members;
    private final Map<String, Role> membersRoles;

    public ChannnelManager() {
        members = new HashSet<>();
        membersRoles = new HashMap<>();
    }

    public void addUser(String userId, Role role) {
        members.add(userId);
        membersRoles.put(userId, role);
    }

    public void addUser(User user) {
        addUser(user.getId(), user.getRole());
    }

    public void addUser(String userId, String role) {
        addUser(userId, Role.valueOf(role));
    }

    public void removeUser(String userId) {
        members.remove(userId);
        membersRoles.remove(userId);
    }

    public void removeUser(User user) {
        removeUser(user.toString());
    }

    public String getRole(String userId) {
        return membersRoles.get(userId).toString();
    }

    public String getRole(User user) {
        if (!membersRoles.containsKey(user.getId())) {
            throw new IllegalArgumentException("The user " + user.getId() + " is not aa participant of channel");
        }
        return membersRoles.get(user.getId()).toString();
    }

    public boolean hasUser(String userId) {
        return members.contains(userId);
    }

    public boolean hasUser(User user) {
        return members.contains(user.getId());
    }
}
