package org.example.chapter6;

public class PrimeNumber {

    public static boolean isPrimeHalf(int number) {
        if (number < 2) return false;
        for (int i = 2; i <= number / 2; i++) {
            if (number % i == 0) return false;
        }
        return true;
    }

    public static boolean isPrimeSqrt(int number) {
        if (number < 2) return false;
        for (int i = 2; i * i <= number; i++) {
            if (number % i == 0) return false;
        }
        return true;
    }

    public static void main(String[] args) {
        System.out.println("uSing n/2:");
        int countHalf = 0;
        for (int i = 2; i < 10000; i++) {
            if (isPrimeHalf(i)) {
                System.out.print(i + " ");
                countHalf++;
            }
        }
        System.out.println("\nTotal primes found: " + countHalf);

        System.out.println("\nusing sqrt(n):");
        int countSqrt = 0;
        for (int i = 2; i < 10000; i++) {
            if (isPrimeSqrt(i)) {
                System.out.print(i + " ");
                countSqrt++;
            }
        }
        System.out.println("\nTotal primes found: " + countSqrt);
    }
}
