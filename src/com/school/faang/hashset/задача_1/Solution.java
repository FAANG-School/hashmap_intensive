package com.school.faang.hashset.задача_1;

public class Solution {
    public static void main(String[] args) {
        EventRegistration eventRegistration = new EventRegistration();
        eventRegistration.register("test1@gmail.com");
        eventRegistration.register("test2@gmail.com");
        eventRegistration.register("test3@gmail.com");
        eventRegistration.register("test4@gmail.com");
        eventRegistration.register("test1@gmail.com");
        eventRegistration.register("test2@gmail.com");

        System.out.println();

        System.out.println("Общее количество участников: " + eventRegistration.getParticipantCount() + '\n');
        System.out.println("Статус регистрации test1" + eventRegistration.isRegistered("test1@gmail.com"));
        System.out.println("Статус регистрации test4" + eventRegistration.isRegistered("test4@gmail.com"));
        System.out.println("Статус регистрации test10" + eventRegistration.isRegistered("test10@gmail.com"));
    }
}
