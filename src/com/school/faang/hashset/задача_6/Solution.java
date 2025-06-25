package com.school.faang.hashset.задача_6;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Set;

public class Solution {
    public static void main(String[] args) {
        RecommendationEngine recommendationEngine = new RecommendationEngine(new HashMap<>());
        Set<String> subscriptions = new HashSet<>();
        subscriptions.add("TechWorld with Nana");
        subscriptions.add("Daily Dose of Internet");
        subscriptions.add("Veritasium");
        subscriptions.add("Kurzgesagt – In a Nutshell");
        subscriptions.add("MKBHD");
        subscriptions.add("CrashCourse");
        subscriptions.add("Tom Scott");
        subscriptions.add("MrBeast");
        subscriptions.add("Yuri Dud");
        subscriptions.add("Real Engineering");

        Set<String> watchHistory = new HashSet<>();
        watchHistory.add("Why Planes Don't Fly Over Tibet");
        watchHistory.add("Building a PC in 10 Minutes");
        watchHistory.add("10 Amazing Science Experiments");
        watchHistory.add("The Truth About the Internet");
        watchHistory.add("How Engines Work");
        watchHistory.add("I Survived 50 Hours in a Jungle");
        watchHistory.add("Why We Age – And How We Can Stop It");
        watchHistory.add("Top 10 Programming Languages in 2025");
        watchHistory.add("Inside the Mind of a Master Procrastinator");
        watchHistory.add("This Is Why You Don’t Skip Leg Day");

        recommendationEngine.addVideo("TechWorld with Nana", "Kubernetes Explained in 10 Minutes");
        recommendationEngine.addVideo("Kurzgesagt – In a Nutshell", "Why We Age – And How We Can Stop It"); // из watchHistory
        recommendationEngine.addVideo("Veritasium", "The Science of Laziness");
        recommendationEngine.addVideo("MrBeast", "Last To Leave Circle Wins $500,000");
        recommendationEngine.addVideo("Kurzgesagt – In a Nutshell", "What If The Earth Stopped Spinning?");
        recommendationEngine.addVideo("CrashCourse", "Top 10 Programming Languages in 2025"); // из watchHistory
        recommendationEngine.addVideo("Veritasium", "Inside the Mind of a Master Procrastinator"); // из watchHistory
        recommendationEngine.addVideo("MKBHD", "iPhone 15 Review: Too Good to Ignore!");
        recommendationEngine.addVideo("MrBeast", "I Spent 7 Days Buried Alive");
        recommendationEngine.addVideo("Real Engineering", "Why Planes Don't Fly Over Tibet"); // из watchHistory
        recommendationEngine.addVideo("Veritasium", "This Puzzle Seems Impossible... Until You Know the Trick");
        recommendationEngine.addVideo("CrashCourse", "Introduction to Artificial Intelligence");
        recommendationEngine.addVideo("Tom Scott", "The Tunnel That Was Buried Twice");
        recommendationEngine.addVideo("Real Engineering", "Why Modern Planes Don’t Have Supersonic Speed");

        recommendationEngine
                .generateFeed(
                        (HashSet<String>) subscriptions,
                        (HashSet<String>)watchHistory)
                .stream()
                .forEach(System.out::println);
    }
}
