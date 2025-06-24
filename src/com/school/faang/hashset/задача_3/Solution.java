package com.school.faang.hashset.задача_3;

import java.util.HashSet;
import java.util.Set;

public class Solution {
    public static void main(String[] args) {
        Set<String> firstUserContacts = Set.of(
                "Alisa",
                "David",
                "Zack",
                "Mike",
                "Luck"
        );

        Set<String> secondUserContacts = Set.of(
                "Tina",
                "Toona",
                "Moona",
                "Zack",
                "Luck"
        );

        Set<String> mutualContacts = MutualContactsFinder.findMutualContacts(firstUserContacts, secondUserContacts);

        System.out.println(mutualContacts.size());
        System.out.println(mutualContacts);
    }
}

class MutualContactsFinder {
    public static HashSet<String> findMutualContacts(Set<String> contacts1, Set<String> contacts2) {
        HashSet<String> mutuals = new HashSet<>(contacts1);

        mutuals.retainAll(contacts2);

        return mutuals;
    }
}
