package com.school.faang.hashset.задача_4;

import org.w3c.dom.ls.LSOutput;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

public class Solution {
    public static void main(String[] args) {

        Set<String> set = new HashSet<>();
        Map<String, String> map = new HashMap<>();

        ChannelManager channelManager = new ChannelManager(set, map);

        channelManager.addUser("id123", "админ");
        channelManager.addUser("id456", "модератор");
        channelManager.addUser("id789", "участник");
        System.out.println(channelManager);

        System.out.println("Проверка наличия пользователя (true / false):");
        System.out.println(channelManager.hasUser("id123"));

        System.out.println("\nПроверка на участника (возврат роли по id) : ");
        System.out.println(channelManager.getRole("id456"));

        System.out.println("\nПроверка на участника (не является участником) : ");
        System.out.println(channelManager.getRole("id457"));

        System.out.println("\nСписок всех людей в 2 коллекциях:");
        System.out.println(set);
        System.out.println(map);

        System.out.println("\nСписок всех людей в 2 коллекциях после удаления:");
        channelManager.removeUser("id123");
        System.out.println(set);
        System.out.println(map);

        System.out.println("Проверка наличия пользователя после удаления (id123) :");
        System.out.println(channelManager.hasUser("id123"));

    }
}
