package com.telusko;

import java.beans.ConstructorProperties;

public class Alien {

    private int age;
//    private Laptop lap;
    private Computer comp;

    public Alien() {
        System.out.println("Object Created");
    }

//    @ConstructorProperties({"age", "lap"})
//    public Alien(int age, Laptop lap){
//        this.age = age;
//        this.lap = lap;
//    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        System.out.println("Setter Called");
        this.age = age;
    }

    public Computer getComp() {
        return comp;
    }

    public void setComp(Computer comp) {
        this.comp = comp;
    }

    public void code(){
        System.out.println("Coding...");
        comp.compile();
    }

}
