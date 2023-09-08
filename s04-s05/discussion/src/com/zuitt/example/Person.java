package com.zuitt.example;


public class Person implements Actions, Greetings{
    public void sleep(){
        System.out.println("Zzzzzzzzz. . . .");
    }

    public void run(){
        System.out.println("Runninnn . . .. ");
    }


    public void morningGreet(){
        System.out.println("Good morning!");
    }


    public void afternoonGreet(){
        System.out.println("Good afternoon!");
    }
}
