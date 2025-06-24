package com.school.faang.hashset.задача_3;

import java.util.HashSet;
import java.util.Set;

public class MutualContactsFinder {

    public static Set<String> findMutualContacts (Set<String> contacts1, Set<String> contacts2) {
        Set<String> mutualContacts = new HashSet<>(contacts1);
        mutualContacts.retainAll(contacts2);
        return mutualContacts;
    }
}
