package com.school.faang.hashset.задача_5;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class GameLobby {
    private final Set<Player> players;
    private final List<Player> playerJoinOrder;

    public GameLobby() {
        this.players = new HashSet<>();
        this.playerJoinOrder = new ArrayList<>();
    }

    public void addPlayer(String nickname) {
        Player newPlayer = new Player(nickname);
        if (players.add(newPlayer)) {
            playerJoinOrder.add(newPlayer);
        }
    }

    public void removePlayer(String nickname) {
        Player tempPlayer = new Player(nickname);
        if (players.remove(tempPlayer)) {
            playerJoinOrder.remove(tempPlayer);
        }
    }

    public boolean hasPlayer(String nickname) {
        return players.contains(new Player(nickname));
    }

    public void displayPlayers() {
        playerJoinOrder.forEach(e -> {
            System.out.println("Имя игрока: " + e.getNickname() +
                    ", Статус: " + e.getStatus());
        });
    }
}
