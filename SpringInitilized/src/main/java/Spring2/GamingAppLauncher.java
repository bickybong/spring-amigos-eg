package Spring2;

import Spring2.game.GameRunner;
import Spring2.game.GamingConsole;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;


@Configuration
@ComponentScan("Spring2.game")
public class GamingAppLauncher {
    public static void main(String[] args) {

        try (var context = new AnnotationConfigApplicationContext(GamingAppLauncher.class)) {
            context.getBean(GamingConsole.class);
            context.getBean(GameRunner.class).run();
        }

    }
}
