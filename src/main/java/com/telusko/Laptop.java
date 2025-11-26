package com.telusko;

public class Laptop implements Computer {
    public Laptop(){
//        System.out.println("Object Laptop Created..");
    }
    @Override
    public void compile(){
        System.out.println("Compiling using Laptop...");
    }
}
