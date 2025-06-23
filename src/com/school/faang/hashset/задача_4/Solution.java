package com.school.faang.hashset.задача_4;

public class Solution {
    public static void main(String[] args) {
        ChannelManager channelManager = new ChannelManager();

        channelManager.addUser("id123", "админ");
        channelManager.addUser("id456", "модератор");
        channelManager.addUser("id789", "участник");

        System.out.println();

        System.out.println("Статус наличия участника id456 в группе: " +
                channelManager.hasUser("id456"));
        System.out.println("Статус наличия участника id457 в группе: " +
                channelManager.hasUser("id457"));

        System.out.println();

        System.out.println("user id123: " + channelManager.getRole("id123"));
        channelManager.removeUser("id123");
        System.out.println("user id123: " + channelManager.getRole("id123"));

    }
}
