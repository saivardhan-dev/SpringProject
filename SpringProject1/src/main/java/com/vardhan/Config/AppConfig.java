package com.vardhan.Config;

import com.vardhan.Computer;
import com.vardhan.Laptop;
import com.vardhan.Desktop;
import com.vardhan.Programmer;
import org.springframework.context.annotation.*;


@ComponentScan("com.vardhan")
@Configuration
public class AppConfig {

//    @Bean
//    @Scope("prototype")
//    public Programmer programmer(){
//        Programmer programmer = new Programmer();
//        return programmer;
//    }
    @Bean
    public Computer desktop(){
        Computer desktop =  new Desktop();
        return desktop;
    }
}
