package com.zuitt.example;

import java.util.Scanner;

public class UsersInput {
    public static void main(String[] args){
        //We instantiate the myObj from the Scanner Class
        //Scanner is used for obtaining input from the terminal
        //"System.in" allows us to takes input from the console
        Scanner myObj = new Scanner(System.in);

        System.out.println("Enter your username:");
        String userName = myObj.nextLine();//Read the user input
        System.out.println("Username is: " + userName);

        System.out.println("Enter a number to add: ");
        System.out.println("Enter first number: ");
        int num1 = myObj.nextInt();
        System.out.println("Enter second number: ");
        int num2 = myObj.nextInt();

        System.out.println("The sum of two numbers is: " + (num1 + num2));

    }
}
