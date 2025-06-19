package com.school.faang.hashmap.task_1;

public class Solution {
    public static void main(String[] args) {
        LikesCounter likesCounter = new LikesCounter();

        likesCounter.likeVideo("1a");
        likesCounter.likeVideo("1a");
        likesCounter.likeVideo("1b");

        System.out.println(likesCounter.getLikes("1a"));
        System.out.println(likesCounter.getLikes("1b"));
        System.out.println(likesCounter.getLikes("1c"));
    }
}
