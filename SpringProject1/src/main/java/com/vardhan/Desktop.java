package com.vardhan;

import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;

@Component

public class Desktop implements Computer{

    public Desktop(){
        System.out.println("Desktop Constructor");
    }

    @Override
    public void compile(){
        System.out.println("Compiling using desktop....");
    }
}
