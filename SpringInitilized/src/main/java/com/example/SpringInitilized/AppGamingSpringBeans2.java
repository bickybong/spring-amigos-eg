package com.example.SpringInitilized;

import com.example.SpringInitilized.game.GameRunner;
import com.example.SpringInitilized.game.GamingConsole;
import com.example.SpringInitilized.game.PacManGame;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class AppGamingSpringBeans2 {

    public static void main(String[] args) {

        try (var context = new AnnotationConfigApplicationContext(GamingConfig.class)) {

            context.getBean(GamingConsole.class);
            context.getBean(GameRunner.class).run();
        }

    }
}
