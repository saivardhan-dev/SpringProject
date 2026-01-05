package com.vardhan;


public class Alien {
    int age;

    Laptop laptop;

    public Alien(){
        System.out.println("Creating Object");
    }

    public void setLaptop(Laptop laptop) {
        this.laptop = laptop;
    }

    public void code(){
        laptop.compile();
    }
}
