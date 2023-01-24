package Spring2.game;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component
@Qualifier("SuperContraGameQualifier")
public class SuperContraGame implements GamingConsole {
    public void up() {
        System.out.println("look up");
    }

    public void down() {
        System.out.println("sit");
    }

    public void left() {
        System.out.println("block");
    }

    public void right() {
        System.out.println("shoot");
    }
}
