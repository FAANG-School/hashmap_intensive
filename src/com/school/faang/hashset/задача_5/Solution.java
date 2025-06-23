package com.school.faang.hashset.задача_5;

public class Solution {
    public static void main(String[] args) {
        GameLobby lobby = new GameLobby();

        lobby.addPlayer("Господин Лещ");
        lobby.addPlayer("Мистер Бублик");

        lobby.addPlayer("Господин Лещ");
        lobby.displayPlayers();

        lobby.changeStatus("Господин Лещ");
        lobby.displayPlayers();



    }
}
