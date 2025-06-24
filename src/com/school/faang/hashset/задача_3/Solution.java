package com.school.faang.hashset.задача_3;

import java.util.HashSet;
import java.util.List;

public class Solution {
    static class MutualContactsFinder {
        static public HashSet<String> findMutualContacts(HashSet<String> contacts1, HashSet<String> contacts2) {
            HashSet<String> mutualContacts = new HashSet<>();

            for (String contact : contacts1) {
                if (contacts2.contains(contact)) {
                    mutualContacts.add(contact);
                }
            }

            return mutualContacts;
            // Функция возвращает пересечение множеств.
        }
    }

    public static void main(String[] args) {
        HashSet<String> firstUserContacts = new HashSet<>();
        HashSet<String> secondUserContacts = new HashSet<>();
        // Создаем два множества контактов для разных пользователей

        firstUserContacts.addAll(List.of("Cristiano Ronaldo", "Lionel Messi", "Robert Lewandowski", "Steve Jobs", "Peter Parker"));
        secondUserContacts.addAll(List.of("Cristiano Ronaldo", "Tony Adams", "Lionel Messi", "Stephen Hawking", "Steve Jobs"));
        // Заполняем контакты пользователей и одинаковыми, и уникальными значениями.

        System.out.println(MutualContactsFinder.findMutualContacts(firstUserContacts, secondUserContacts));
        // Ожидаемый вывод: [Steve Jobs, Cristiano Ronaldo, Lionel Messi]

        System.out.println(firstUserContacts);
        System.out.println(secondUserContacts);
    }
}
