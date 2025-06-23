package com.school.faang.hashset.задача_3;

import java.util.HashSet;
import java.util.Set;

public class Solution {
    public static void main(String[] args) {
        Set<String> contacts1 = new HashSet<>();
        Set<String> contacts2 = new HashSet<>();

        contacts1.add("dan");
        contacts1.add("kim");
        contacts1.add("vlad");

        contacts2.add("dan");
        contacts2.add("vlad");
        contacts2.add("nik");

        Set<String> mutualContacts = MutualContactsFinder.findMutualContacts(contacts1, contacts2);

        System.out.println("Количество общих контактов: " + mutualContacts.size());
        System.out.println("Общие контакты: " + mutualContacts);


    }
}
