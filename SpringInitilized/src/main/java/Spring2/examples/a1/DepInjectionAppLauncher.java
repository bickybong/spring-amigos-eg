package Spring2.examples.a1;

import Spring2.game.GameRunner;
import Spring2.game.GamingConsole;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

import java.util.Arrays;


@Configuration
@ComponentScan("Spring2.examples.a1")
public class DepInjectionAppLauncher {
    public static void main(String[] args) {
        try (var context = new AnnotationConfigApplicationContext(DepInjectionAppLauncher.class)) {
            Arrays.stream(context.getBeanDefinitionNames())
                    .forEach(System.out::println);
        }

    }
}
