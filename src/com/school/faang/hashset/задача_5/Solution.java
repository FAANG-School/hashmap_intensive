package com.school.faang.hashset.задача_5;

public class Solution {
    public static void main(String[] args) {

        GameLobby lobby = new GameLobby();

        lobby.addPlayer("player1");
        lobby.addPlayer("player2");
        lobby.addPlayer("player3");

        lobby.addPlayer("player2");

        lobby.displayPlayers();

        lobby.removePlayer("player1");

        System.out.println("\nПроверка наличия:");
        System.out.println("player1 в лобби? " + lobby.hasPlayer("player1"));
        System.out.println("player2 в лобби? " + lobby.hasPlayer("player2"));

        lobby.displayPlayers();

        lobby.addPlayer("player4");
        lobby.displayPlayers();


    }
}
