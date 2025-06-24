package com.school.faang.hashset.задача_5;

import java.util.Comparator;
import java.util.Map;
import java.util.Set;

public class GameLobby {
    private Set<Player> players;
    private Map<Player, Integer> playerJoinOrder;

    private int joinCounter = 0;


    public GameLobby(Set<Player> players, Map<Player, Integer> playerJoinOrder) {
        this.players = players;
        this.playerJoinOrder = playerJoinOrder;
    }

    public void addPlayer(String nickname) {
        Player newPlayer = new Player(nickname);
        if (players.add(newPlayer)) {
            joinCounter++;
            playerJoinOrder.put(newPlayer, joinCounter);
        }
    }

    public void removePlayer(String nickname) {
        Player player = new Player(nickname);
        players.remove(player);
        playerJoinOrder.remove(player);
    }

    public boolean hasPlayer(String nickname) {
        Player player = new Player(nickname);
        return players.contains(player);
    }

    public void displayPlayers() {
        playerJoinOrder
                .entrySet()
                .stream()
                .sorted(Comparator.comparing(Map.Entry::getValue))
                .forEach(entry -> {
                    System.out.print(entry.getKey().getNickname() + " ");
                });
        System.out.println();
    }
}
