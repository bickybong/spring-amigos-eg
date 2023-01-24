package com.example.SpringInitilized.game;

public class GameRunner {
    static GamingConsole game;

    public GameRunner(GamingConsole game) {
        this.game = game;
    }

    public static void run() {
        System.out.println("Running game: " + game);
        game.up();
        game.down();
        game.left();
        game.right();
    }
}
