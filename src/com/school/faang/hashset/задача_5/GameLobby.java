package com.school.faang.hashset.задача_5;

import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Set;

public class GameLobby {

    private Set<Player> players;
    private Set<Player> playerJoinOrder;

    public GameLobby() {

        players = new HashSet<>();
        playerJoinOrder = new LinkedHashSet<>();

    }

    public void addPlayer(String nickname) {

        Player newPlayer = new Player(nickname);

        if (players.add(newPlayer)) {

            playerJoinOrder.add(newPlayer);
            System.out.println("Игрок " + nickname + " присоединился к лобби!");

        } else {

            System.out.println("Ошибка: игрок " + nickname + " уже в лобби!");

        }
    }

    public void removePlayer(String nickname) {

        Player playerToRemove = new Player(nickname);

        if (players.remove(playerToRemove)) {

            playerJoinOrder.remove(playerToRemove);
            System.out.println("Игрок " + nickname + " покинул лобби.");

        } else {

            System.out.println("Ошибка: игрок " + nickname + " не найден в лобби.");

        }
    }

    boolean hasPlayer(String nickname) {

        return players.contains(new Player(nickname));

    }

    void displayPlayers() {

        System.out.println("\n--- Текущий состав лобби ---");
        System.out.println("Всего игроков: " + playerJoinOrder.size());

        for (Player player : playerJoinOrder) {

            System.out.println("• " + player.getNickname() + " [" + player.getStatus() + "]");

        }

    }
}
