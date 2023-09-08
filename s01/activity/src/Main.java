import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // Create a Scanner object
        Scanner scanner = new Scanner(System.in);

        // Prompt for and read first name
        System.out.println("First Name:");
        String firstName = scanner.nextLine();

        // Prompt for and read last name
        System.out.println("Last Name:");
        String lastName = scanner.nextLine();

        // Prompt for and read grades in three subjects
        System.out.println("First Subject Grade:");
        double firstSubject = scanner.nextDouble();

        System.out.println("Second Subject Grade:");
        double secondSubject = scanner.nextDouble();

        System.out.println("Third Subject Grade:");
        double thirdSubject = scanner.nextDouble();

        // Calculate average grade and round down to the nearest integer
        double averageGrade = (firstSubject + secondSubject + thirdSubject) / 3.0;
        int roundedAverage = (int) Math.floor(averageGrade);

        // Display full name and the rounded average grade
        System.out.println("Good day, " + firstName + " " + lastName + ".");
        System.out.println("Your grade average is: " + roundedAverage);

        // Close the scanner
        scanner.close();
    }
}
