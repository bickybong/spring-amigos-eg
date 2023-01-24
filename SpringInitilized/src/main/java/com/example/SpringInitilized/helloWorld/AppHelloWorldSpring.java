package com.example.SpringInitilized.helloWorld;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class AppHelloWorldSpring {
    public static void main(String[] args) {
        //    1. Launch a spring context
        try (var context = new AnnotationConfigApplicationContext(HelloWorldConfig.class)) {
            //        2. Config the things we want Spring to manage

//        3. Retreiving Beans managed by Spring
            System.out.println(context.getBean("age"));
            System.out.println(context.getBean("name"));
            System.out.println(context.getBean("person"));
            System.out.println(context.getBean("person2MethodCall"));
            System.out.println(context.getBean("person3Parameter"));
            System.out.println(context.getBean("person4Parameter"));
            System.out.println(context.getBean("person5Parameter"));
            System.out.println(context.getBean("address2"));
            System.out.println(context.getBean(Person.class));
            System.out.println(context.getBean(Address.class));

//        Arrays.stream(context.getBeanDefinitionNames())
//                .forEach(e -> System.out.println(e));

        }

    }


}
