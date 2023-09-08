package com.zuitt.example;

public class Driver {
    //properties
    private String name;

    public Driver(){}

    public Driver(String name){
        this.name = name;
    }

    public String getName(){
        return this.name;
    }

    public void setName(String name){
        this.name = name;
    }
}
