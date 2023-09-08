import java.util.ArrayList;
import java.util.HashMap;

public class Main {
    public static void main(String[] args) {
        // Declare and initialize an array for the first 5 prime numbers.
        int[] primeNumbers = {2, 3, 5, 7, 11};

        // Output specific elements of the array by specifying the index.
        System.out.println("The first prime number is: " + primeNumbers[0]);
        System.out.println("The second prime number is: " + primeNumbers[1]);
        System.out.println("The third prime number is: " + primeNumbers[2]);
        System.out.println("The fourth prime number is: " + primeNumbers[3]);
        System.out.println("The fifth prime number is: " + primeNumbers[4]);

        // Create an ArrayList of String data-type elements using generics and add 4 elements to it.
        ArrayList<String> friendsList = new ArrayList<>();
        friendsList.add("John");
        friendsList.add("Jane");
        friendsList.add("Chloe");
        friendsList.add("Zoey");

        // Output the contents of the ArrayList concatenated with a string message.
        System.out.println("My friends are: " + friendsList);

        // Create a HashMap with keys of type String and values of type Integer.
        HashMap<String, Integer> inventory = new HashMap<>();
        inventory.put("toothpaste", 15);
        inventory.put("toothbrush", 20);
        inventory.put("soap", 12);

        // Output the contents of the HashMap concatenated with a string message.
        System.out.println("Our current inventory consists of: " + inventory);
    }
}
