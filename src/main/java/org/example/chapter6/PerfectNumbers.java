package org.example.chapter6;

import java.util.Scanner;

public class PerfectNumbers {

    public static boolean isPerfect(int number) {
        int sum = 0;
        for (int i = 1; i <= number / 2; i++) {
            if (number % i == 0) {
                sum += i;
            }
        }
        return sum == number;
    }

    public static void printFactors(int number) {
        for (int i = 1; i <= number / 2; i++) {
            if (number % i == 0) {
                System.out.print(i + " ");
            }
        }
        System.out.println();
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter number of elements: ");
        int n = scanner.nextInt();

        System.out.println("Enter " + n + " numbers:");
        for (int i = 0; i < n; i++) {
            int number = scanner.nextInt();
            if (isPerfect(number)) {
                System.out.print(number + " is a perfect number. Factors: ");
                printFactors(number);
            }
            else{
                System.out.println("Those numbers are not perfect");
            }
        }
    }
}
