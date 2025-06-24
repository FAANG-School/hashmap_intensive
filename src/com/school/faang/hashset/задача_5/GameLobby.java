package com.school.faang.hashset.задача_5;

import java.util.Set;
import java.util.HashSet;
import java.util.LinkedHashSet;

public class GameLobby {

    private final Set<Player> players;

    public GameLobby() {
        players = new LinkedHashSet<>();
    }

    public void addPlayer(String nickname) {
        players.add(new Player(nickname));
    }

    public void removePlayer(String nickname) {
        players.remove(new Player(nickname));
    }

    public boolean hasPlayer(String nickname) {
        return players.contains(new Player(nickname));
    }

    public void displayPlayers() {
        players.forEach(System.out::println);
    }
}
