// number guess game 
import java.util.*;

public class NumberGuessingGame {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Random random = new Random();

        int score = 0;
        boolean playAgain = true;

        System.out.println("Welcome to the Guessing Game!");

        while (playAgain) {
            int randomNumber = random.nextInt(100) + 1; // Generate a random number between 1 and 100
            int attempts = 0;
            boolean guessedCorrectly = false;

            System.out.println("I have selected a number between 1 and 100. Can you guess it?");
            System.out.println("You have 7 attempts.");

            while (attempts < 7 && !guessedCorrectly) {
                System.out.print("Enter your guess: ");
                int userGuess = scanner.nextInt();
                attempts++;

                if (userGuess == randomNumber) {
                    System.out.println("Congratulations! You guessed the correct number.");
                    guessedCorrectly = true;
                    score++;
                } else if (userGuess < randomNumber) {
                    System.out.println("Too low! Try again.");
                } else {
                    System.out.println("Too high! Try again.");
                }
            }

            if (!guessedCorrectly) {
                System.out.println("Sorry, you've run out of attempts. The correct number was: " + randomNumber);
            }

            System.out.println("Your current score: " + score);

            System.out.print("Do you want to play another round? (yes/no): ");
            String response = scanner.next();
            playAgain = response.equalsIgnoreCase("yes");
        }

        System.out.println("Thanks for playing! Your final score is: " + score);
        scanner.close();
    }
}
