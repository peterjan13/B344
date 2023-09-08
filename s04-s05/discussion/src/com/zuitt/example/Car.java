package com.zuitt.example;

public class Car {
    //Access Modifiers
    // These are used to restrict the scope of a class, constructor, variable, method or data member.

    //Four Types of Access Modifiers:
    //1. Default - No Keyword indicated (Accessibility is within the package).
    //2. Private (private) - Properties or method is only accessible within the class
    //3. Protected - properties and methods are only accesible byt the class of the same package and the subclass present in any package.
    //4. Public - properties and methods that can be accessed from anywhere.

    //Class Creation
    //1. Properties -  characteristic of an object
    private String name;
    private String brand;
    private int yearOfMake;

    //Make a component for a car through composition
    private Driver driver;
    //2. Constructor - used to create/instantiate an object. That the constructor will always be in public.
    //a. empty constructor - creates object that doesn't have any arguments/ parameters. Also referred as default constructor.
    public Car(){
        this.name = "Empty Car";
        this.brand = "Empty Car";
        this.yearOfMake = 0;
    }

    //b. parameterized constructor - creates an object with argument/parameters
    public Car(String name, String brand, int yearOfMake) {
        this.name = name;
        this.brand = brand;
        this.yearOfMake = yearOfMake;
        this.driver = new Driver("Manong");

    }
    //3. Getters and setters - get and set the values of each property of an object. Keep in mind that the number of setters and getter depends on the number of properties.
    //Getters- it retrieves the value of instantiate object.

    //Getter for name property:
    public String getName(){
        return this.name;
    }

    //Getter for brand property
    public String getBrand(){
        return this.brand;
    }

    //Getter for the yearOfMake property
    public int getYearOfMake(){
        return this.yearOfMake;
    }

    //Getter for the Driver:
    public String getDriverName(){
        return this.driver.getName();
    }
    //Setters - use to change the default value of an instatiated object

    //Setter for the name property
    public void setName(String name){
        this.name = name;
    }

    //Setter for the brand property
    public void setBrand(String brand){
        this.brand = brand;
    }

    //Setter for the yearOfMake property
    public void setYearOfMake(int yearOfMake){
        this.yearOfMake = yearOfMake;
    }

    public void setDriverName(String driver){
        this.driver.setName(driver);
    }


    //4. Methods(optional) - functions an object can perform (behavior.)
    public void drive(){
        System.out.println("The car is running. Vroom. Vroom.");
    }

}
