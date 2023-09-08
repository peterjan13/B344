package com.zuitt.example;

import java.util.Arrays;

public class RepetitionControl {
    public static void main(String[] args) {
        //[Section] Loops
        //are control Structures that allow code blocks to be executed multiple times

        //While Loop
        //allow for repetitive use of code, similar to for-lops, but are usually used for situations where the content to iterate is indefinite

        //to create the variable that will serve as the basis of our condition

        int x = 11;
        while (x < 10) {
            x++;
            System.out.println("The current value of x is : " + x);

        }

        //Do-While Loop
        //similar to while loop. However, do-while loops always execute atleast once - while loops may not execute/run at all;
        int y = 11;
        do {
            System.out.println("The current value of y is " + y);
            y++;
        } while (y < 10);

        //For-loop:
        //Syntax:
        //for(initialVal; condition/stopper; iteration{codeblock/statement};

        for(int i = 0; i < 10 ; ++i){
            System.out.println("The current value of i is " + i);
        }

        String[] nameArray = {"John", "Paul", "George", "Ringo"};

        //for loops for arrays:
        for(String name : nameArray){
            System.out.println(name);
        }

        String[][] classrooms = new String[3][3];
        //First row
        classrooms[0][0] = "Athos";
        classrooms[0][1] = "Porthos";
        classrooms[0][2] = "Aramis";
        //Second row
        classrooms[1][0] = "Brandon";
        classrooms[1][1] = "JunJun";
        classrooms[1][2] = "Jobert";
        //Third row
        classrooms[2][0] = "Mickey";
        classrooms[2][1] = "Donald";
        classrooms[2][2] = "Goofy";

        //Using For-loop iterates all the possible elements in the two-dimensional array.
        //for loop in a multidimensional array:
        for(String[] row : classrooms){
            //add another for loop that will iterate on the nested array inside our classrooms array
            //System.out.println(Arrays.toString(row));
            for(String column : row){
                System.out.println(column);
            }
        }
    }
}
