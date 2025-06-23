package com.school.faang.hashset.задача_5;

public class Solution {
    public static void main(String[] args) {
        GameLobby gameLobby = new GameLobby();
        gameLobby.addPlayer("test1");
        gameLobby.addPlayer("test1");
        gameLobby.addPlayer("test2");
        gameLobby.addPlayer("test3");
        gameLobby.addPlayer("test4");

        System.out.println("До удаления");
        gameLobby.displayPlayers();
        gameLobby.hasPlayer("test2");
        gameLobby.removePlayer("test2");
        gameLobby.hasPlayer("test2");

        System.out.println('\n' + "После удаления");
        gameLobby.displayPlayers();
    }
}
