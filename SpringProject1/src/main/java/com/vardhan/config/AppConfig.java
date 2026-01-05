package com.vardhan.config;

import com.vardhan.Alien;
import com.vardhan.Computer;
import com.vardhan.Desktop;
import com.vardhan.Laptop;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.*;
import org.springframework.stereotype.Component;


@Configuration
@ComponentScan("com.vardhan")
public class AppConfig {

//    @Bean
//    public Alien alien(@Qualifier("desktop") Computer com){
//        Alien obj = new Alien();
//        obj.setAge(23);
//        obj.setCom(com);
//        return obj;
//    }
//
//    @Bean
//    public Desktop desktop() {
//        return new Desktop();
//    }
//
//    @Bean
//    @Primary
//    public Laptop laptop(){
//        return new Laptop();
//    }
}
