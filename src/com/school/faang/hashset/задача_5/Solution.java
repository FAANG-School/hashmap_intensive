package com.school.faang.hashset.задача_5;

public class Solution {

    public static void main(String[] args) {

        GameLobby users = new GameLobby();
        users.addPlayer("Alex");
        users.addPlayer("Vlad");
        users.addPlayer("Egor");
        users.addPlayer("Grigoriy");
        users.addPlayer("Vlad");
        users.displayPlayers();
        users.removePlayer("Egor");
        System.out.println(users.hasPlayer("Egor"));
        users.changeStatusOnAndminPlayer("Vlad");
        users.changeStatusOnModeratorPlayer("Alex");
        users.changeStatusOnParticipantPlayer("Grigoriy");
        System.out.println(users.hasPlayer("Vlad"));
        System.out.println(users.hasPlayer("Alex"));
        System.out.println(users.hasPlayer("Grigoriy"));
        users.displayPlayers();

    }
}
