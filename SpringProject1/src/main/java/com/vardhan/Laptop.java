package com.vardhan;


public class Laptop implements Computer {

    @Override
    public void compile(){
        System.out.println("Programmer using this Laptop to compile");
    }
}
