package com.school.faang.hashset.задача_5;

public class Solution {
    public static void main(String[] args) {
        GameLobby lobby = new GameLobby();

        safeAddPlayer(lobby, "ProGamer2000");
        safeAddPlayer(lobby, "DarkAssassin");
        safeAddPlayer(lobby, "SniperWolf");
        safeAddPlayer(lobby, "ProGamer2000"); // Дубликат
        safeAddPlayer(lobby, "VeryLongNickname123456"); // Слишком длинный ник

        lobby.displayPlayers();

        System.out.println("DarkAssassin в лобби: " + lobby.hasPlayer("DarkAssassin"));
        System.out.println("Пустой ник в лобби: " + lobby.hasPlayer(""));

        safeSetStatus(lobby, "ProGamer2000", "Готов");
        safeSetStatus(lobby, "SniperWolf", "В игре");
        safeSetStatus(lobby, "SniperWolf", "Неизвестный статус");

        safeRemovePlayer(lobby, "DarkAssassin");
        safeRemovePlayer(lobby, "NonExistentPlayer");

        lobby.displayPlayers();

        for (int i = 1; i <= 10; i++) {
            safeAddPlayer(lobby, "Player" + i);
        }
    }

    private static void safeAddPlayer(GameLobby lobby, String nickname) {
        try {
            lobby.addPlayer(nickname);
        } catch (IllegalArgumentException | IllegalStateException e) {
            System.out.println("Ошибка при добавлении игрока: " + e.getMessage());
        }
    }

    private static void safeRemovePlayer(GameLobby lobby, String nickname) {
        try {
            lobby.removePlayer(nickname);
        } catch (IllegalArgumentException e) {
            System.out.println("Ошибка при удалении игрока: " + e.getMessage());
        }
    }

    private static void safeSetStatus(GameLobby lobby, String nickname, String status) {
        try {
            lobby.setPlayerStatus(nickname, status);
        } catch (IllegalArgumentException e) {
            System.out.println("Ошибка при изменении статуса: " + e.getMessage());
        }
    }
}
