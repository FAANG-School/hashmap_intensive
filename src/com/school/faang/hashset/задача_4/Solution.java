package com.school.faang.hashset.задача_4;

import java.util.HashMap;
import java.util.HashSet;

public class Solution {
    public static void main(String[] args) {
        ChannelManager channelManager = new ChannelManager(new HashSet<>(), new HashMap<>());
        channelManager.addUser("id123", Roles.админ.toString());
        channelManager.addUser("id456", Roles.модератор.toString());
        channelManager.addUser("id789", Roles.участник.toString());

        System.out.println(channelManager.hasUser("id123"));
        System.out.println("Роль пользователя с ID 'id456': " +  channelManager.getRole("id456"));
        channelManager.removeUser("id123");
        System.out.println(channelManager.hasUser("id123"));
    }
}
