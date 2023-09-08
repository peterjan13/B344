import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        System.out.println("(While-loop) Input an integer whose factorial will be computed:");

        Scanner in = new Scanner(System.in);
        int numWhile = 0;

        try {
            numWhile = in.nextInt();
            if (numWhile < 0) {
                throw new IllegalArgumentException("Input must be a non-negative integer.");
            }
        } catch (Exception e) {
            System.out.println("Invalid input, input should be an integer. " + e.getMessage());
            return;
        }

        System.out.println("(For-loop) Input an integer whose factorial will be computed:");

        int numFor = 0;

        try {
            numFor = in.nextInt();
            if (numFor < 0) {
                throw new IllegalArgumentException("Input must be a non-negative integer.");
            }
        } catch (Exception e) {
            System.out.println("Invalid input. " + e.getMessage());
            return;
        }

        int answerWhile = 1;
        int counterWhile = 1;

        // Using a while loop
        while (counterWhile <= numWhile) {
            answerWhile *= counterWhile;
            counterWhile++;
        }

        System.out.println("Factorial of " + numWhile + " using a while loop is: " + answerWhile);

        // Reset variables for for loop
        int answerFor = 1;
        int counterFor = 1;

        // Using a for loop
        for (int i = 1; i <= numFor; i++) {
            answerFor *= i;
        }

        System.out.println("Factorial of " + numFor + " using a for loop is: " + answerFor);
    }
}
