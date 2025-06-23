package com.school.faang.hashset.задача_3;

import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class Solution {
    public static void main(String[] args) {
        Set<String> mutualContacts = MutualContactsFinder.findMutualContacts(
                new HashSet<>(List.of("Иван", "Федр", "Акакий", "Семён", "Константин", "Самир", "Дженсен")),
                new HashSet<>(List.of("Самир", "Дженсен", "Шура", "Денис", "Акакий", "Ратмир"))
        );

        System.out.println("Количество общих контактов: " + mutualContacts.size());
        mutualContacts.stream().forEach(contact -> System.out.print(contact + " "));
    }
}
