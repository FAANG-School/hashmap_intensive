package com.school.faang.hashset.задача_4;

public class Solution {
    public static void main(String[] args) {

        ChannelManager manager = new ChannelManager();
        User anna = new User("id123","админ");
        User nick = new User("id456","модератор");
        User michel = new User("id789","участник");

        manager.addUser(anna);
        manager.addUser(nick);
        manager.addUser(michel);

        manager.hasUser(anna);
        System.out.println(manager.getRole(anna));

        manager.removeUser(nick);

        manager.hasUser(nick);
        System.out.println(manager.getRole(nick));

    }
}
