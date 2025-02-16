package com.springkanth.app.model;

import org.springframework.stereotype.Component;

@Component
public class Laptop implements Computer {

    public void compile(){
        System.out.println("Code is compiling using the Laptop....");
    }
}
