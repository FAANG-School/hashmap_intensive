package com.school.faang.hashset.задача_3;

import java.util.HashSet;
import java.util.Set;

class MutualContactsFinder{
    public static Set<String> findMutualContacts(Set<String> contacts1, Set<String> contacts2){
        Set<String> sharedContacts = new HashSet<>(contacts1);
        sharedContacts.retainAll(contacts2);
        return sharedContacts;
    }
}
public class Solution {
    public static void main(String[] args) {
        Set<String> user1 = Set.of("Alice", "Bob", "Charlie", "Vanya");
        Set<String> user2 = Set.of("Alice", "Diana", "Charlie", "Katya", "Vanya");
        Set<String> result = MutualContactsFinder.findMutualContacts(user1, user2);
        System.out.println(result.size());
        System.out.println(result);
    }
}
