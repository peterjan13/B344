import com.zuitt.example.*;

// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {
        //OOP
        //OOP stands for "Object Oriented Programming".
        //OOP is programming model that allows developers to design software around data or objects, rather than function and logic.

        //OOP Concepts
        //Object - abstract idea that represents something in the real world:
        //Example: The concept of a dog.
        //Class - representation of object using code. Blueprint/framework
        //Example: Writing a code that would describe a dog.
        //Instance - unique copy of the idea, made physical.
        //Example: Instantiating a dog named Browny from the dog class.

        //Objects
        //States and attributes - what is the idea about? It would describe the properties that the object has.
        //Behaviors- what can idea do?
        //Example: A person has attributes like name, age, height, and weight. A person can also eat, sleep, and speak.

        //Four Pillars of OOP
        //1. Encapsulation
        //a mechanism of wrapping the data (variables) and code acting on the data (methods) together as a single unit.
        //"data handling" - the variables of a class will be hidden from other classes, and can be accessed only through the methods of the current class
        //variables/properties as private
        //provide a public setter and getter function.

        //Instantiate a class Car with empty argument.
        Car myCar = new Car("Vios", "Toyota", 2025);

        //getters
        System.out.println(myCar.getName());
        System.out.println(myCar.getBrand());
        System.out.println(myCar.getYearOfMake());

        //setters
        myCar.setName("Conan");
        System.out.println(myCar.getName());

        Car emptyCar = new Car();
        System.out.println(emptyCar.getName());


        //Composition and Inheritance
        //both concepts promotes code reuse through different
        //Inheritance - allows modelling an object that is a subset of another object.
        //Composition allows modelling object that are made ip of other objects

        System.out.println(myCar.getDriverName());
        myCar.setDriverName("Kuya");
        System.out.println(myCar.getDriverName());

        Dog myPet = new Dog("Browny", "Black", "Askal");

        System.out.println(myPet.getName());
        myPet.setName("Black");
        System.out.println(myPet.getName());

        myPet.call();
        System.out.println(myPet.getBreed());

        myPet.makeSound();

        //Abstraction
        //is a process where all the logic and complexity are hidden from the user

        //Interface
        // is used to achieve total abstraction
        //Creating Abstract classes doesn't support multiple inheritance
        Person child = new Person();

        child.sleep();
        child.run();
        child.morningGreet();
        child.afternoonGreet();

        //Polymorphism
            //Greek work poly(many) and morph (forms)
            //In short, many forms

            //Two main types
            //Static or compile time polymorphism - overloading
            //Dynamic or run time polymorphism - overridden

        StaticPoly myAddition = new StaticPoly();

        myAddition.addition(1, 2);

        myAddition.addition(1.1, 2.2);

        myAddition.addition(2, 3, 4);

        Parent myParent = new Parent();
        Child myChild = new Child();

        myParent.speak();
        myChild.speak();
    }
}