package com.school.faang.hashset.задача_5;

import java.util.HashSet;

public class GameLobby {

    private final HashSet<Player> players;
    private final HashSet<Player> playerJoinOrder;
    private static final int MAX_PLAYERS = 10;

    public GameLobby() {
        this.players = new HashSet<>();
        this.playerJoinOrder = new HashSet<>();
    }

    public void addPlayer(String nickname) {
        if (players.size() >= MAX_PLAYERS) {
            throw new IllegalStateException("Лобби переполнено (максимум " + MAX_PLAYERS + " игроков)");
        }

        Player newPlayer = new Player(nickname);

        if (players.contains(newPlayer)) {
            throw new IllegalArgumentException("Игрок " + nickname + " уже в лобби");
        }

        players.add(newPlayer);
        playerJoinOrder.add(newPlayer);
        System.out.println(nickname + " присоединился к лобби");
    }

    public void removePlayer(String nickname) {
        Player playerToRemove = new Player(nickname);
        if (!players.remove(playerToRemove)) {
            throw new IllegalArgumentException("Игрок " + nickname + " не найден в лобби");
        }
        playerJoinOrder.remove(playerToRemove);
        System.out.println(nickname + " покинул лобби");
    }

    public boolean hasPlayer(String nickname) {
        try {
            return players.contains(new Player(nickname));
        } catch (IllegalArgumentException e) {
            System.err.println("Ошибка проверки игрока: " + e.getMessage());
            return false;
        }
    }

    public void setPlayerStatus(String nickname, String status) {
        Player searchPlayer = new Player(nickname);
        for (Player player : players) {
            if (player.equals(searchPlayer)) {
                player.setStatus(status);
                System.out.println(nickname + " сменил статус на: " + status);
                return;
            }
        }
        throw new IllegalArgumentException("Игрок " + nickname + " не найден в лобби");
    }

    public void displayPlayers() {
        System.out.println("\nТекущие игроки в лобби:");
        int position = 1;
        for (Player player : playerJoinOrder) {
            System.out.println(position++ + ". " + player);
        }
        System.out.println();
    }
}
