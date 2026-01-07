package com.vardhan.springbootpractice;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

@SpringBootApplication
public class SpringBootPracticeApplication {

    public static void main(String[] args) {

        ConfigurableApplicationContext context = SpringApplication.run(SpringBootPracticeApplication.class, args);

        Programmer obj = context.getBean(Programmer.class);
        System.out.println("Programmer Age = "+obj.getAge());
        obj.code();
    }
}
