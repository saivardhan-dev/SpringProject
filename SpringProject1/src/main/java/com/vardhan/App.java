package com.vardhan;

import com.vardhan.Config.AppConfig;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class App
{
    public static void main( String[] args )
    {
        ApplicationContext context = new ClassPathXmlApplicationContext("spring.xml");
        Programmer obj = context.getBean("programmer",Programmer.class);
        obj.code();

        ApplicationContext context1 = new AnnotationConfigApplicationContext(AppConfig.class);
        Programmer obj1 = context1.getBean(Programmer.class);
        Programmer obj2 = context1.getBean(Programmer.class);
        Computer obj3 = context1.getBean(Computer.class);
        obj1.setAge(20);
        obj2.setAge(30);
        obj3.compile();
        System.out.println("obj1 age: " + obj1.getAge());
        System.out.println("obj2 age: " + obj2.getAge());
    }
}
