import java.util.Random;
import java.util.Scanner;

public class GuessTheNumber {

    public static void main(String[] args) {
        // Scanner class for user input
        Scanner s = new Scanner(System.in);

        // Maximum number of attempts allowed to USER
        int maxAttempts = 4;

        // Create an instance/object of the Random class
        Random random = new Random();

        // Generate a random number between 0 (inclusive) and 100 (inclusive)
        int randomInt = random.nextInt(101);

        System.out.println("Guess the number (between 0 and 100):");

        // Initialize attempt counter
        int attempts = 0;

        // Loop for user attempts
        while (attempts < maxAttempts) {
            // Increment the attempt counter
            attempts++;

            // Prompt user for a guess
            System.out.print("Attempt " + attempts + ": Enter your guess: ");
            int userGuessNumber = s.nextInt();

            // Check if the guess is correct
            if (userGuessNumber == randomInt) {
                System.out.println("Congratulations! Your guess is correct.");
                break; // Exit the loop
            } else if (userGuessNumber < randomInt) {
                System.out.println("Too low! Try again.");
            } else {
                System.out.println("Too high! Try again.");
            }

            // Check if the user has used all attempts and run out.
            if (attempts == maxAttempts) {
                System.out.println("Oops! You've used all your attempts.");
                System.out.println("The correct guess was: " + randomInt);
            }
        }
        s.close();
    }
}

