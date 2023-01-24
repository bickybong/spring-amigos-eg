package Spring2.examples.BusinessCalcExercise;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@ComponentScan
public class RealWorldLauncher {
    public static void main(String[] args) {
        try (var context = new AnnotationConfigApplicationContext(RealWorldLauncher.class)) {
            System.out.println(context.getBean(BusinessClacService.class).findMax());
        }

    }

}
