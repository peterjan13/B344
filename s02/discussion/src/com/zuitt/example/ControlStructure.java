package com.zuitt.example;

import java.util.Scanner;

public class ControlStructure {
    public static void main(String[] args){
        //[Section] Java Operators
        //Arithmetic: -, +, /, *, %;
        //Comparison: <, >, >=, <=, ==, !=;
        //Logical: &&, ||, !;
        //Re/assignment operator: =, +=, -=, *=, /=;
        //Increment and decrement: i++, ++i, --i, i--;

        //[Section] Selection Control Structure:

        int num1 = 36;
        if(num1 % 5 == 0){
            System.out.println(num1 + " is disivible by 5.");
        }else{
            System.out.println(num1 + " is not disivible by 5.");
        }

        //[Section] Short Circuiting
        //a technique applicable only to the AND & OR operators wherein if statement/s or other control structure exits early by ensuring safety operation or for efficiency
        //if(condition 1 || condition2 || condition3 || condition4)

        //[Section] Ternary Operator
        int num2 = 24;
        Boolean result = (num2>0) ? true : false;
        System.out.println(result);

        //[Section] Switch Statement
        //are used to control the flow structures that allow one code block out of many other code blocks;

        Scanner numberScanner = new Scanner(System.in);
        System.out.println("Enter a number: ");
        int directionValue = numberScanner.nextInt();

        switch (directionValue){
            case 1:
                System.out.println("North");
                break;
            case 2:
                System.out.println("South");
                break;
            case 3:
                System.out.println("East");
                break;
            case 4:
                System.out.println("West");
                break;
            default:
                System.out.println("Invalid");
        }
    }
}
