package Spring2.examples.a0;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.stereotype.Component;

import java.util.Arrays;

@Component
class YourBusinessCLass {
//            field injections
    Dependency1 dependency1;
    Dependency2 dependency2;

//    autowired
    public YourBusinessCLass(Dependency1 dependency1, Dependency2 dependency2) {
        System.out.println("Constructor injection");
        this.dependency1 = dependency1;
        this.dependency2 = dependency2;
    }

    public Dependency1 getDependency1() {
        return dependency1;
    }

    @Autowired
    public void setDependency1(Dependency1 dependency1) {
        System.out.println("set injection 1");
        this.dependency1 = dependency1;
    }

    public Dependency2 getDependency2() {
        return dependency2;
    }

    @Autowired
    public void setDependency2(Dependency2 dependency2) {
        System.out.println("set injection 2");
        this.dependency2 = dependency2;
    }

    @Override
    public String toString() {
        return "Using " + dependency1 + " and " + dependency2;
    }
}

@Component
class Dependency1 {

}

@Component
class Dependency2 {

}

@Configuration
@ComponentScan()
//scans current package
public class DepInjectionAppLauncher {
    public static void main(String[] args) {
        try (var context = new AnnotationConfigApplicationContext(DepInjectionAppLauncher.class)) {
            Arrays.stream(context.getBeanDefinitionNames())
                    .forEach(System.out::println);

            System.out.println(context.getBean(YourBusinessCLass.class));
        }

    }
}
