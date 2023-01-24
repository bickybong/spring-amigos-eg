package com.example.SpringInitilized.helloWorld;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Primary;

record Person(String name, int age, Address address) {
};

record Address(String firstLine, String city) {

};

@Configuration
public class HelloWorldConfig {
    @Bean
    public String name() {
        return "Bicky";
    }

    @Bean
    public Integer age() {
        return 25;
    }

    @Bean
    public Person person() {
        return new Person("Ravi", 20, new Address("Sweet City", "Candy"));
    }

    @Bean
    @Primary
    public Person person2MethodCall() {
        return new Person(name(), age(), address());
    }

    @Bean
    public Person person3Parameter(String name, int age, Address address3) {
        return new Person(name, age, address3);
    }

    @Bean
    public Person person4Parameter(String name, int age, Address address) {
        return new Person(name, age, address);
    }

    @Bean
    public Person person5Parameter(String name, int age, Address address3) {
        return new Person(name, age, address3);
    }

    @Bean(name = "address2")
    @Primary
    public Address address() {
        return new Address("Baker Street", "London");
    }

    @Bean(name = "address3")
    @Qualifier("address3qualifier")
    public Address address3() {
        return new Address("Tampines", "Singapore");
    }
}

