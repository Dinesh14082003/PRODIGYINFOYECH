import java.util.Random;
import java.util.Scanner;
public class GuessTheNumber {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Random random = new Random();
        int numberToGuess = random.nextInt(100) + 1;
        int userGuess = 0;
        int numberOfTries = 0;
        while (userGuess != numberToGuess) {
            System.out.print("Guess a number between 1 and 100: ");
            userGuess = scanner.nextInt();
            numberOfTries++;
            if (userGuess < numberToGuess) {
                System.out.println("Too low! Try again.");
            } else if (userGuess > numberToGuess) {
                System.out.println("Too high! Try again.");
            } else {
                System.out.println("Congratulations! You guessed the number in " + numberOfTries + " tries.");
            }
        }
        scanner.close();
    }
}