package com.school.faang.hashset.задача_4;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

public class ChannelManager {
    private Set<String> members;
    private Map<String, String> memberRoles;

    public ChannelManager() {
        members = new HashSet<>();
        memberRoles = new HashMap<>();
    }

    void addUser(User user) {
        members.add(user.getId());
        memberRoles.put(user.getId(), user.getRole());
    }

    void removeUser(User user) {
        members.remove(user.getId());
        memberRoles.remove(user.getId());
    }

    String getRole(User user) {
        String userId = user.getId();
        if (!memberRoles.containsKey(userId)) {
            System.out.println("Не является участником");
            return null;
        }
        return memberRoles.get(userId);
    }

    void hasUser(User user) {
        String userId = user.getId();
        if (members.contains(userId)) {
            System.out.println("Пользователь " + userId + " в списке");
        } else {
            System.out.println("Пользователь " + userId + " не является участником");
        }
    }
}
