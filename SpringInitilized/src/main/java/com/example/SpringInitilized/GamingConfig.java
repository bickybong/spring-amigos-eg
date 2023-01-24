package com.example.SpringInitilized;

import com.example.SpringInitilized.game.GameRunner;
import com.example.SpringInitilized.game.GamingConsole;
import com.example.SpringInitilized.game.PacManGame;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class GamingConfig {

    @Bean
    public GamingConsole game(){
        var game = new PacManGame();
        return game;
    }
    @Bean
    public GameRunner gameRunner(GamingConsole game){
        var gameRunner = new GameRunner(game);
        return gameRunner;
    }
}
