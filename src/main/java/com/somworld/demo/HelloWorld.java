package com.somworld.demo;

/**
 * Created by somesh.shrivastava on 15/01/15.
 */
public class HelloWorld {

    private String name;

    public void setName(String name){
        this.name = name;
    }

    public void printHello(){
        System.out.println("Spring 4.0"+ name);
    }
}
