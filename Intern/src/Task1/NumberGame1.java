package Task1;

import java.util.Scanner;
import java.util.Random;

public class NumberGame1 {
    public static void main(String[] args) {
        
        Random rand = new Random();
        int randomNumber = rand.nextInt(100) + 1;
        
        
        Scanner scanner = new Scanner(System.in);
        int userGuess = 0;
        
        System.out.println("Guess a number between 1 and 100:");
        
       
        while (userGuess != randomNumber) {
           
            System.out.print("Enter your guess: ");
            userGuess = scanner.nextInt();
            
            
            if (userGuess < randomNumber) {
                System.out.println("Too low! Try again.");
            } else if (userGuess > randomNumber) {
                System.out.println("Too high! Try again.");
            } else {
                System.out.println("Congratulations! You guessed the correct number.");
            }
        }
        
        scanner.close();
    }
}

