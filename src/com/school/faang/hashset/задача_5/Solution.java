package com.school.faang.hashset.задача_5;

import java.util.HashMap;
import java.util.HashSet;

public class Solution {
    public static void main(String[] args) {
        GameLobby gameLobby = new GameLobby(new HashSet<>(), new HashMap<>());
        gameLobby.addPlayer("Иван");
        gameLobby.addPlayer("Константин");
        gameLobby.addPlayer("Федор");
        gameLobby.addPlayer("Федор");
        gameLobby.addPlayer("Дмитрий");
        gameLobby.addPlayer("Женя");
        gameLobby.addPlayer("Павел");

        gameLobby.displayPlayers();

        gameLobby.removePlayer("Дмитрий");

        gameLobby.displayPlayers();
    }
}
