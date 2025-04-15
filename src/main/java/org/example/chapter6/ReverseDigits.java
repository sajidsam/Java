package org.example.chapter6;

import java.util.Scanner;

public class ReverseDigits {

    public static int reverse(int number) {
        int reversed = 0;
        while (number != 0) {
            int digit = number % 10;
            reversed = reversed * 10 + digit;
            number /= 10;
        }
        return reversed;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter an integer: ");
        int value = scanner.nextInt();
        int reversedValue = reverse(value);
        System.out.println("Reversed number: " + reversedValue);
    }
}
