package com.school.faang.hashset.задача_1;

public class Solution {
    public static void main(String[] args) {
        EventRegistration participants = new EventRegistration ();
        participants.register("Aleksandr_chilikin01@mail.ru");
        participants.register("Aleksandr_chilikin02@mail.ru");
        System.out.println(participants.getParticipantCount());
        System.out.println(participants.isRegistered("Vlad_Mishustin01@mail.ru"));
    }
}
