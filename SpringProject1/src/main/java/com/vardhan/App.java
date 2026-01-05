package com.vardhan;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class App
{
    public static void main( String[] args )
    {

        ApplicationContext context = new ClassPathXmlApplicationContext("spring.xml");

        Alien obj1=context.getBean("alien",Alien.class);
        obj1.code();

        obj1.age=21;
        System.out.println(obj1.age);

        Alien obj2=context.getBean("alien",Alien.class);
        obj2.code();
        System.out.println(obj2.age);
    }
}
