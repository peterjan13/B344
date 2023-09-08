package com.zuitt.example;

public class StaticPoly {
    public int addition(int a, int b){
        System.out.println("I am from the first version.");
        return a+b;
    }

    public int addition(int a, int b, int c){
        System.out.println("I am from the second version.");
        return a+b+c;
    }

    public double addition(double a, double b){
        System.out.println("I am from the third version.");
        return a+b;
    }
}
