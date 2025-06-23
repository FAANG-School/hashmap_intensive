package com.school.faang.hashset.задача_3;

import java.util.Set;

public class Solution {
    public static void main(String[] args) {
        Set<String> contact1 = Set.of("test1", "test2", "test3", "test4", "test5");
        Set<String> contact2 = Set.of("test2", "test4");

        MutualContactsFinder mutualContactsFinder = new MutualContactsFinder();
        Set<String> mutuals = mutualContactsFinder.findMutualContacts(contact1, contact2);

        System.out.println("Количество общих контактов: " + mutuals.size() + '\n' +
                "Общие контакты: " + mutuals);
    }
}
