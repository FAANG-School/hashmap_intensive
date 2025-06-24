package com.school.faang.hashset.задача_5;

import java.util.HashSet;

public class Solution {
    public static void main(String[] args) {
        GameLobby gameLobby = new GameLobby(new HashSet<>(), new HashSet<>());

        gameLobby.addPlayer("donk");
        gameLobby.addPlayer("monesy");
        gameLobby.addPlayer("sh1pro");
        gameLobby.addPlayer("boombl4");
        gameLobby.addPlayer("monesy");

        gameLobby.removePlayer("boombl4");
        System.out.println(gameLobby.hasPlayer("boombl4"));
        gameLobby.displayInfo();


    }
}
