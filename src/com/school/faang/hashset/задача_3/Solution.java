package com.school.faang.hashset.задача_3;

import java.util.HashSet;
import java.util.Set;

public class Solution {
    public static void main(String[] args) {

        Set<String> contacts1 = new HashSet<>();
        contacts1.add("@kirill");
        contacts1.add("@dima");
        contacts1.add("@boris");

        Set<String> contacts2 = new HashSet<>();
        contacts2.add("@drei");
        contacts2.add("@dima");
        contacts2.add("@dimon322");
        contacts2.add("@kirill");

        Set<String> mutuals = MutualContactsFinder.findMutualContacts(contacts1, contacts2);

        System.out.println("Количество общих контактов: " + mutuals.size());
        for (String mutual : mutuals) {
            System.out.println("• " + (mutual));
        }

    }

}
