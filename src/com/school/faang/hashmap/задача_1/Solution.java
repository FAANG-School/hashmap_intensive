package com.school.faang.hashmap.задача_1;

import java.util.HashMap;

public class Solution {

    public static void main(String[] args) {
        LikeCount likeCount = new LikeCount();

        likeCount.putVideo("nQw4w5WgXcQ");
        likeCount.likeVideo("dQw4w9WgXcQ");
        likeCount.likeVideo("dQw4w9WgXcQ");
        likeCount.likeVideo("7Qw4w9WgXcQ");
        likeCount.likeVideo("7Qw4w9WgXcQ");
        likeCount.likeVideo("dQw4w9WgXcQ");
        likeCount.likeVideo("dQw4w9WgXcQ");
        likeCount.likeVideo("7Qw4w9WgXcQ");

        likeCount.getLikes("7Qw4w9WgXcQ");
        likeCount.printAllLikes();
    }
}
