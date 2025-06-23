package com.school.faang.hashset.задача_1;

public class Solution {
    public static void main(String[] args) {
        EventRegistration eventRegistration = new EventRegistration();

        eventRegistration.register("@people1");
        eventRegistration.register("@people2");
        eventRegistration.register("@people3");
        eventRegistration.register("@people4");
        eventRegistration.register("@people5");
        eventRegistration.register("@people3");

        System.out.println(eventRegistration.getParticipantCount());
        System.out.println(eventRegistration.isRegistered("@people2"));
    }
}
