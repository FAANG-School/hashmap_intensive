package com.school.faang.hashset.задача_4;

import java.util.Map;
import java.util.Set;

public class ChannelManager {
    private Set<String> members;

    private Map<String, String> memberRoles;

    public ChannelManager(Set<String> members, Map<String, String> memberRoles) {
        this.members = members;
        this.memberRoles = memberRoles;
    }

    public void addUser(String userId, String role){
        members.add(userId);
        memberRoles.put(userId, role);
    }

    public void removeUser(String userId){
        members.remove(userId);
        memberRoles.remove(userId);
    }

    public String getRole(String userId){
        if(memberRoles.containsKey(userId)){
            return memberRoles.get(userId);
        }
        else{
            throw new IllegalArgumentException("Не является участником");
        }
    }

    public boolean hasUser(String userId){
        return members.contains(userId);
    }
}
