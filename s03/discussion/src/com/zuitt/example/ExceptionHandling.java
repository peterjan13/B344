package com.zuitt.example;

import java.util.Scanner;

public class ExceptionHandling {
    public static void main(String[] args){
        //Exceptions
            //a problem that arises during the execution of a program.
            //it disrupts the normal flow of the program and terminate it abnormally
        //Exception Handling
            //refers to managing and catching run-time errors in order to safely run your code
            //"compile-time" errors are errors that usually happen when you try to compile program that is syntactically incorrect or has missing package.
            //Run-time errors, on the other hand, are errors that  happen after compilation and during the execution program

        Scanner input = new Scanner(System.in);

        //Declare a variable num with data type int:
        int num = 0;

//        System.out.println("Please enter a number:");
//        num = input.nextInt();
//
//        System.out.println("You have entered" + num);
//
//        System.out.println("Hello Batch344");

        //Try-catch-finally
        //In try statement, it will try to execute the code/statements inside the code block.
        System.out.println("Enter your number");
        try{
            num = input.nextInt();
        }catch(Exception e){
            //if the try statement returns an exception will automatically pass to the catch statement and will execute the code block inside of it.
            System.out.println("Invalid Input");
            //print the probable error along with the other details like the number line and class number where the exception occur
            e.printStackTrace();
        }
        //optional
        finally {
            System.out.println("You have entered: " + num);
        }

        System.out.println("Hello Batch 344!");
    }
}
