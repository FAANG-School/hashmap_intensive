package com.school.faang.hashset.задача_5;

public class Solution {
    public static void main(String[] args) {
        GameLobby gameLobby = new GameLobby();
        gameLobby.addPlayer("Vladik1997");
        gameLobby.addPlayer("MichsSS");
        gameLobby.addPlayer("VladMishustin");
        gameLobby.addPlayer("VladMishustin");
        System.out.println(gameLobby.hasPlayer("Vladik1997"));
        gameLobby.displayPlayers();
        gameLobby.removePlayer("Vladik1997");
        System.out.println(gameLobby.hasPlayer("Vladik1997"));
        gameLobby.displayPlayers();
    }
}
