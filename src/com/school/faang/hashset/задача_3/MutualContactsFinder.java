package com.school.faang.hashset.задача_3;

import java.util.HashSet;

public class MutualContactsFinder {

    public static HashSet<String> findMutualContacts (HashSet<String> contacts1, HashSet<String> contacts2) {
        HashSet<String> mutualContacts = new HashSet<>(contacts1);
        mutualContacts.retainAll(contacts2);
        return mutualContacts;
    }
}
