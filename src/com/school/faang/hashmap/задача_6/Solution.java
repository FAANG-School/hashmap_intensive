package com.school.faang.hashmap.задача_6;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Solution {
    public static void main(String[] args) {
        List<Tweet> tweetList = new ArrayList<>(){{
            add(new Tweet("@anna", Arrays.asList("#java", "#programming")));
            add(new Tweet("@ivan", Arrays.asList("#java", "#cooking")));
            add(new Tweet("@egor", Arrays.asList("#cooking", "#programming")));
            add(new Tweet("@egor", Arrays.asList("#cooking", "#programming")));
            add(new Tweet("@egor", Arrays.asList("#cooking", "#programming")));
            add(new Tweet("@anna", Arrays.asList("#java")));
        }};

        Tweet.findTopAuthors(tweetList);
    }
}
