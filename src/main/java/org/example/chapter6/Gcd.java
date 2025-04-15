package org.example.chapter6;

import java.util.Scanner;

public class Gcd {

    public static int gcd(int a, int b) {
        while (b != 0) {
            int temp = b;
            b = a % b;
            a = temp;
        }
        return a;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("enter first number: ");
        int num1 = scanner.nextInt();
        System.out.print("Enter second Number: ");
        int num2 = scanner.nextInt();

        int result = gcd(num1, num2);
        System.out.println("greatest common divisor: " + result);
    }
}
