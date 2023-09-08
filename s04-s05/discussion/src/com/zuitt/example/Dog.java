package com.zuitt.example;

//Child class of Animal class
//"extends" keyword is used to inherit all the properties and methods of the parent class.
public class Dog extends Animal{

    private String breed;

    public Dog(){
        super();
    }

    public Dog(String name, String color, String breed){
        super(name, color);
        this.breed = breed;
    }

    //Getter
    public String getBreed(){
        return this.breed;
    }

    //Setter
    public void setBreed(String breed){
        this.breed = breed;
    }


    //method
    public void makeSound(){
        System.out.println("Woof, woof, woof! Sheeeeesh");
    }
}
