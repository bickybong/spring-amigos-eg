package com.amigoscode;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

//@SpringBootApplication does componentscan and enableautoconfig
@SpringBootApplication
@RestController
public class Main {
    public static void main(String[] args) {
        SpringApplication.run(Main.class, args);
    }

    @GetMapping("/greet")
    public GreetResponse greet() {
        return new GreetResponse(
                "Hello",
                List.of("Java", "Go", "JS"),
                new Person("Alex", 26, 9000)
                );
    }

//    record creates class

    record Person(String name, int age, double cash) {

    }

    record GreetResponse(
            String greet,
            List<String> favProgrammingLanguages,
            Person person
    ) {
    }

}
