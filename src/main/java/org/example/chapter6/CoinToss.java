package org.example.chapter6;

import java.util.Random;
import java.util.Scanner;

public class CoinToss {

    public enum Coin {
        HEADS, TAILS
    }

    public Coin flip() {
        Random random = new Random();
        int result = random.nextInt(2);
        return result == 0 ? Coin.HEADS : Coin.TAILS;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        CoinToss coinToss = new CoinToss();

        int headsCount = 0;
        int tailsCount = 0;

        while (true) {
            System.out.println("1. Toss Coin");
            System.out.println("2. Exit");
            System.out.print("Enter your choice: ");
            int choice = scanner.nextInt();

            if (choice == 1) {
                Coin result = coinToss.flip();
                if (result == Coin.HEADS) {
                    headsCount++;
                } else {
                    tailsCount++;
                }
                System.out.println("Toss Result: " + result);
                System.out.println("Heads: " + headsCount + " Tails: " + tailsCount);
            } else if (choice == 2) {
                System.out.println("Exiting teh program");
                break;
            } else {
                System.out.println("Invalid , try again");
            }
        }
    }
}
