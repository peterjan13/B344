package com.zuitt.example;
//A "package" in Java is used to group related classes. Think of it as a folder in a file directory
    //Packages are divided into two categories:
        //1. Built - in packages (Packages from the Java API)
        //2. User-defined Packages (create your own packages)

//Package creation in Java follows the "reverse domain name notation" for the naming convention.
public class Variables {
    public static void main(String[] args){
    //Naming Convention
        //The terminology use for variable names is identifier.
        //All identifiers should begin with a letter (A to Z, a to z), currency ($) or an underscore
        //After the first character, identifiers can have any combination of characters.
        //Most importantly, identifiers are case-sensitive.

        //Variable declaration:
        int age;
        char middleName;

        //Variable declaration together with initialization:
        int x;
        int y = 0;

        //Initialization after declaration:
        x = 1;

        //output to the system:
        System.out.println("The value of y is " + y + "and the value of x is " + x);

        //Primitive Data types:
            //predefined within the Java Programming Language which is used for single-valued variables with limited capabilities.

        // int - whole number values
        int wholeNumber = 10000;
        System.out.println(wholeNumber);

        //long - L is added to end of the long number to be recognized;
        long worldPopulation = 8346283648L;
        System.out.println(worldPopulation);

        //Floating value
        //float add f at the end of the value
        //up to 7 decimal places
        float piFloat = 3.14159265359f;
        System.out.println("The value of piFloat is " + piFloat);

        //double - floating values
        double piDouble = 3.14159265359;
        System.out.println("The value of piDouble is " + piDouble);

        //char - single character
        //uses single quote
        char letter = 'a';
        System.out.println(letter);

        //boolean - true or false value
        boolean isLove = true;
        boolean isTaken = false;
        System.out.println(isLove);
        System.out.println(isTaken);

        //constants
        //Java uses the "final" keyword so that variable's value cannot be changed;

        final int PRINCIPAL = 3000;
        System.out.println(PRINCIPAL);


        //Non-primitive Data
            //also known as reference data types refers to instances or objects.
            //does not directly store the value of a variable, but rather remember the reference to that variable
        //String
        //Stores a sequence or array of characters
        //String are actually object that can use methods


        String username = "JSmith";
        System.out.println(username);

        //sample sting method
        int stringLength = username.length();
        System.out.println(stringLength);
    }
}
