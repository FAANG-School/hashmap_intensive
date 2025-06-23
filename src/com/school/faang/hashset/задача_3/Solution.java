package com.school.faang.hashset.задача_3;

import java.util.HashSet;
import java.util.Set;

public class Solution {
    public static void main(String[] args) {

        Set<String> user1Contacts = new HashSet<>();
        user1Contacts.add("Alice");
        user1Contacts.add("Bob");
        user1Contacts.add("Charlie");
        user1Contacts.add("Diana");
        user1Contacts.add("Eve");

        Set<String> user2Contacts = new HashSet<>();
        user2Contacts.add("Bob");
        user2Contacts.add("Diana");
        user2Contacts.add("Frank");
        user2Contacts.add("Grace");
        user2Contacts.add("Eve");

        Set<String> mutualContacts = MutualContactsFinder.findMutualContacts(user1Contacts, user2Contacts);

        System.out.println("Количество общих контактов: " + mutualContacts.size());
        System.out.println("Общие контакты: " + mutualContacts);
    }
}
