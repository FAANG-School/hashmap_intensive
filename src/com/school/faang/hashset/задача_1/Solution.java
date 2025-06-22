package com.school.faang.hashset.задача_1;

public class Solution {
    public static void main(String[] args) {
        EventRegistration registration = new EventRegistration();

        registration.register("Anna@mail.ru");
        registration.register("Svetlana@list.ru");

        registration.register("Anna@mail.ru");

        System.out.println(registration.getParticipantCount());

        registration.printStatusEmail("Anna@mail.ru");
    }
}
