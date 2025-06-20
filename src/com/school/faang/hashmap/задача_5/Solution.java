package com.school.faang.hashmap.задача_5;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class Solution {
    public static void main(String[] args) {
        Map<String, Integer> popularWords = new HashMap<>();
        String regex = "[-–,./-:; ]";
        String text = "HTTP передает незашифрованные данные, что означает, что информация, " +
                "отправленная из браузера, может быть перехвачена и прочитана третьими лицами. " +
                "Этот процесс не идеален, поэтому он был расширен до HTTPS, чтобы повысить уровень " +
                "безопасности взаимодействия. HTTPS объединяет HTTP-запросы и ответы с технологиями SSL и TLS." +
                "Оригинальная версия HTTP, выпущенная в 1996–1997 годах, называлась HTTP/1.1. " +
                "HTTP/2 и HTTP/3 являются обновленными версиями собственно протокола. " +
                "Система передачи данных была модифицирована для повышения ее эффективности. " +
                "Например, HTTP/2 обменивается данными в двоичном, а не текстовом формате. " +
                "Это также позволяет серверам заранее передавать ответы в кэши клиентов, " +
                "а не ждать нового HTTP-запроса. HTTP/3 – относительно новая версия, " +
                "но мы пытаемся сделать еще один шаг вперед в развитии HTTP/2. " +
                "Цель HTTP/3 – более эффективная поддержка потоковой передачи в режиме реального времени " +
                "и других современных требований к передаче данных. HTTPS уделяет приоритетное внимание " +
                "вопросам безопасности данных в HTTP. Современные системы используют HTTP/2 с SSL/TLS " +
                "в качестве HTTPS. По мере развития HTTP/3 браузерные и серверные технологии в конечном " +
                "итоге также будут интегрированы в HTTPS.";

        String[] parsedText = Arrays.stream(text.toLowerCase().split(regex))
                .parallel()
                .filter(word -> !word.isEmpty())
                .toArray(String[]::new);

        Arrays.stream(parsedText).toList().forEach(e -> popularWords.merge(e, 1, Integer::sum));

        popularWords.entrySet().stream()
                .filter(e -> e.getValue() > 5)
                .forEach(System.out::println);
    }
}
