package org.example.chapter6;

import java.util.Random;
import java.util.Scanner;

public class NumberGuess {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Random random = new Random();



        while (true) {
            int nmbrToGs = random.nextInt(1000) + 1; 
            int guess = 0;
            int attempts = 0;

            System.out.println("Guess a number between 1 and 1000.");

            while (guess != nmbrToGs) {
                System.out.print("Enter your guess: ");
                guess = scanner.nextInt();
                attempts++;

                if (guess > nmbrToGs) {
                    System.out.println("Too high. Try again.");
                } else if (guess < nmbrToGs) {
                    System.out.println("Too low. Try again.");
                }
            }

            System.out.println("Congratulations! You guessed the number in " + attempts + " attempts!");

            System.out.print("play again? (yes/no): ");
            String response = scanner.next();
            if (response.equalsIgnoreCase("no")) {
                System.out.println("Thanks for playing!");
                break;

            }
        }
    }
}
