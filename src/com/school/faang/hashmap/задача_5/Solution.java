package com.school.faang.hashmap.задача_5;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class Solution {
    public static void main(String[] args) {
        String text =
                """
                        В этой статье я расскажу об одном из средств обеспечения версионности
                        схем и управления миграциями БД — библиотеке Flyway.
                        С поблемой версионности схемы базы данных рано или поздно
                        приходится сталкиваться разработчикам любого приложения,
                        опирающегося на СУБД. Увы, иногда эта проблема принимается
                        в рассмотрение слишком поздно — например, если вопрос о внесении
                        изменений в структуру базы встаёт, когда приложение уже находится в эксплуатации.
                        Но и на этапе разработки контроль схемы базы данных причиняет не меньше проблем,
                        чем все прочие аспекты версионности приложения: в отсутствие
                        чёткой системы управления управления управления управления управления управления миграциями локальная,
                        стендовая и эксплуатационная базы могут быстро «разъехаться»,
                        не предоставляя при этом никакой информации относительно
                        своего текущего состояния.
                        """.toLowerCase().replaceAll("[,.—:«»]", "");

        String[] words = text.split(" ");
        Map<String, Integer> countOfWord = new HashMap<>();

        Arrays.stream(words).forEach(word -> {
            if (!countOfWord.containsKey(word)) {
                countOfWord.put(word, 0);
                return;
            }
            countOfWord.replace(word, countOfWord.get(word) + 1);
        });

        for (Map.Entry<String, Integer> entry : countOfWord.entrySet()) {
            if (entry.getValue() > 5) {
                System.out.println(entry.getKey() + " : " + entry.getValue());
            }
        }
    }
}
