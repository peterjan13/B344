package com.zuitt.example;

import java.awt.*;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;

public class Array {
    //[Section] Java Collection
    //are a single unit of objects.
    //Useful for manipulating relevant pieces of data that can be used in different situation, commonly used in loops
    public static void main(String[] args){
        //This is where we add our codebase
        //[Section] Array
        //In Java, arrays are container of values of the same type of given a predefined amount/number of values.
        //Java arrays are more rigid, once the size and data type are defined, they can no longer be changed.

        //Syntax: Array Declaration:
            //datatype[] identifier = new dataType[numOfElements];
            //"[]" indicates that the data type should be able to hold multiple values.
            //"new" keyword is used for non-primitive data types to tell Java to create the said variable.
            //"numOfElements" will tell how many elements does our array can hold;
        //Array declaration:
        int[] intArray = new int[5];

        //to initialize the value of our elements inside the array, we are going to use the index
        intArray[0] = 200;
        intArray[1] = 122;
        intArray[2] = 322;
        intArray[3] = 566;


        //This will just print out the memory address of the Array.
        System.out.println(intArray);

        //To print out the intArray, we need to import the Array Class and use the .toString() method.
        //this method will convert the array as a string in the terminal.
        System.out.println(Arrays.toString(intArray));

        //Declaration and Initialization of an Array
        //Syntax:
            //dataType[] identifier = {elementA, elementB, ...};
            //the compiler automatically specifies the size by counting the number of elements during the initialization.

        String[] names = {"Seth", "Timothy", "Ayka"};
        //names[3] = "Chris";
        System.out.println(Arrays.toString(names));

        //Sample java array methods:
        //sort method:
        Arrays.sort(intArray);

        System.out.println("Order of items after sort: " + Arrays.toString(intArray));

        //Multidimensional Array
        //A two-dimensional array, can be described by two lengths nested within each other, like a matrix.
            //first length is row, second lengthe is the column, arrayNam[][]

        //[['as', 'bs', 'ds'], ['as', 'bs', 'ds'], ['as', 'bs', 'ds']]
        String[][] classroom = new String[3][3];
        //First Row
        classroom[0][0] = "Athos";
        classroom[0][1] = "Porthos";
        classroom[0][2] = "Aramis";

        //Second Row
        classroom[1][0] = "Brandon";
        classroom[1][1] = "Junjun";
        classroom[1][2] = "Jobert";

        //Third Row
        classroom[2][0] = "Micky";
        classroom[2][1] = "Donald";
        classroom[2][2] = "Goofey";

        //This is only applicable to those two-dimensional
        System.out.println((Arrays.deepToString(classroom)));

        //Note: In Java, the size of the array cannot be modified. If there is a need to add or remove elements, you need to create a new array.

        //[Section] ArrayList
            //Resizable array, wherein elements can be added or removed whenever it is needed.
            //Syntax:
                //ArrayList<T> identifier = new ArrayList<T>();
                //"<T>" is used to specify that the list can only have one type of object in a collection
                //ArrayList cannot hold primitive data types, "java wrapper classes" provide a way to use this types as object.
                //In short, Object version of primitive data type with methods.
            //Declaration of an ArrayList
                //Example of usage of primitive data type as a generic in the ArrayList
                //ArrayList<int> numbers = new ArrayList<int>();

                //usage of Integer
                ArrayList<Integer> numbers = new ArrayList<Integer>();

                //Add elements
                //arrayName.add(element);
                numbers.add(1);
                System.out.println(numbers);

                //access element
                //arrayListName.get(index);
                System.out.println(numbers.get(0));

                //Declaration with Initialization
                ArrayList<String> students = new ArrayList<String>(Arrays.asList("Jane", "Mike"));

                //add elements on the ArrayList students:
                students.add("John");
                System.out.println(students);

                //access the elements
                System.out.println(students.get(2));

                //updating an element
                //arraylistName.set(index, updatedValue/Element);
                students.set(2, "Juan");
                System.out.println(students);

                //remove a specific element
                //arrayListName.remove(index);
                students.remove(1);
                System.out.println(students);

                //Getting the arrayList size:
                //arrayListName.size();
                System.out.println(students.size());

                //Removing all the elements
                //arrayListName.clear();
                students.clear();
                System.out.println(students);
                System.out.println(students.size());

        //[SECTION] Hashmaps
        //most objects in Java are defined and are instantiated of Classes that contains a proper set of properties and methods.
        //There might be use cases where it is  not appropriate, or you may simply want a collection of data in key-value pairs.
        //in Java "keys" also referred as "fields" where in the values can be accessed through fields.
        //Syntax:
            //Hashmap<dataTypeField, dataTypeValue> identifier = new HashMap<dataTypeField, dataTypeValue>();
        //Declaration of a Hashmap:
        HashMap<String, String> jobPosition = new HashMap<String, String>();

        System.out.println(jobPosition);


        //Methods in Hashmap:
        //Add key-value pair
        //HashMapName.put(fieldName, fieldValue);
        jobPosition.put("Student", "Brandon");
        jobPosition.put("Dreamer", "Alice");
        //The last one will be overridden, whenever a same key is used
        jobPosition.put("Student", "John");
        System.out.println(jobPosition);

        //Accessing element - we use field name because they are unique.
        //hashMapName.get("fieldName");
        //that if the fieldName does not exist on the HashMap, it will give us null value.
        System.out.println(jobPosition.get("Student"));

        //Updating Values
        //HashMapName.replace("fieldNameToChange", "newValue");
        jobPosition.replace("Student", "John Doe");
        System.out.println(jobPosition);

        //Remove an element
        //HashMapName.remove("key");
        //jobPosition.remove("Dreamer");
        //System.out.println(jobPosition);

        //Retrieve HashMap keys
        //HashMapName.keySet();
        System.out.println(jobPosition.keySet());

        //Retrieve HashMap values
        //HashMapName.values();
        System.out.println(jobPosition.values());

        //Remove all the key-value pairs
        //HashMapName.clear();
        jobPosition.clear();
        System.out.println(jobPosition);

        //Declaration of HashMap with Initialization
        HashMap<String, String> jobPosition2 = new HashMap<String, String>(){
            {
                put("Teacher", "John");
                put("Artist", "Jane");
            }
        };

        System.out.println(jobPosition2);

    }
}
