package com.school.faang.hashset.задача_4;

public class Solution {
    public static void main(String[] args) {

        ChannelManager channel = new ChannelManager();

        channel.addUser("id123", "админ");
        channel.addUser("id456", "модератор");
        channel.addUser("id789", "участник");

        System.out.println("Пользователь id456 в канале: " + channel.hasUser("id456"));

        System.out.println("Роль пользователя id123: " + channel.getRole("id123"));

        channel.removeUser("id789");
        System.out.println("\nПосле удаления пользователя id789:");

        System.out.println("Пользователь id789 в канале: " + channel.hasUser("id789"));
        System.out.println("Роль пользователя id789: " + channel.getRole("id789"));
    }
}
