package com.zuitt.example;

public class Animal {
    //properties
    protected String name;
    protected  String color;

    //Constructors
    public Animal(){}

    public Animal(String name, String color){
        this.name = name;
        this.color = color;
    }
    //Getter and Setter
    public String getName(){
        return this.name;
    }

    public String getColor(){
        return this.color;
    }

    public void setName(String name){
        this.name = name;
    }

    public void setColor(String color){
        this.color = color;
    }

    //method
    public void call(){
        System.out.println("Hi my name is" + this.name);
    }
}
