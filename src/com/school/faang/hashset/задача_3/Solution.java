package com.school.faang.hashset.задача_3;

import java.util.HashSet;
import java.util.Set;

public class Solution {
    public static void main(String[] args) {
        HashSet<String> userOneContacts = new HashSet<>();

        userOneContacts.add("Володька");
        userOneContacts.add("Саня завод");
        userOneContacts.add("Лизка 1500 руб");

        HashSet<String> userTwoContacts = new HashSet<>();
        userTwoContacts.add("Володька");
        userTwoContacts.add("Лизка 1500 руб");
        userTwoContacts.add("Андрюха пиво");

        Set<String> mutualContacts = MutualContactsFinder.findMutualContacts(userOneContacts, userTwoContacts);
        System.out.println("Общие контакты (" + mutualContacts.size() + "): " + mutualContacts);
    }

    private static class MutualContactsFinder {
        public static Set<String> findMutualContacts(HashSet<String> contactsOne, HashSet<String> contactsTwo) {
            Set<String> newContacts = new HashSet<>(contactsTwo);
            newContacts.retainAll(contactsOne);

            return newContacts;
        }
    }
}
