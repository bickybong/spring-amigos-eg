package Spring2.game;

import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;

@Component
@Primary
public class MarioGame implements GamingConsole {
    public void up() {
        System.out.println("Jump");
    }

    public void down() {
        System.out.println("Crouch");
    }

    public void left() {
        System.out.println("turn left");
    }

    public void right() {
        System.out.println("turn right");
    }
}
