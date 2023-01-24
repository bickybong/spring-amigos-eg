package com.example.SpringInitilized;

import com.example.SpringInitilized.game.GameRunner;
import com.example.SpringInitilized.game.PacManGame;

public class AppGamingJavaBasic1 {

    public static void main(String[] args) {
//        1. object creation
//        var game = new SuperContraGame();
        var game = new PacManGame();
//        var game = new MarioGame();
//        2. object creation + wiring dependencies
        var gameRunner = new GameRunner(game);
        gameRunner.run();
    }
}
