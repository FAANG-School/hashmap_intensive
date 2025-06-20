package com.school.faang.hashmap.task_6;

import java.util.ArrayList;
import java.util.List;

public class Solution {
    public static void main(String[] args) {
        List<Tweet> tweets = new ArrayList<>(
                List.of(
                        new Tweet("@anna", new ArrayList<>(List.of("#java", "#programming"))),
                        new Tweet("@ivan", new ArrayList<>(List.of("#java"))),
                        new Tweet("@anna", new ArrayList<>(List.of("#java")))
                )
        );

        Statistic statistic = new Statistic();
        statistic.printTopAuthors(tweets);
    }
}
