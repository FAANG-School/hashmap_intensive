package com.school.faang.hashset.задача_3;

import java.util.HashSet;

public class Solution {
    public static void main(String[] args) {
        HashSet<String> user1Contacts = new HashSet<>();
        user1Contacts.add("Alice");
        user1Contacts.add("Bob");
        user1Contacts.add("Charlie");
        user1Contacts.add("Diana");
        user1Contacts.add("Eve");

        HashSet<String> user2Contacts = new HashSet<>();
        user2Contacts.add("Bob");
        user2Contacts.add("Diana");
        user2Contacts.add("Frank");
        user2Contacts.add("Grace");
        user2Contacts.add("Eve");

        HashSet<String> mutualContacts = MutualContactsFinder.findMutualContacts(user1Contacts, user2Contacts);

        System.out.println("Количество общих контактов: " + mutualContacts.size());
        System.out.println("Общие контакты: " + mutualContacts);
    }
}
