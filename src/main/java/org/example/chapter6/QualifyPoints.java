package org.example.chapter6;

import java.util.Scanner;

public class QualifyPoints {

    public static int qualityPoints(int avg) {
        if (avg >= 90 && avg <= 100)
            return 4;
        else if (avg >= 80)
            return 3;
        else if (avg >= 70)
            return 2;
        else if (avg >= 60)
            return 1;
        else
            return 0;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("enter students avrage: ");
        int average = scanner.nextInt();

        int points = qualityPoints(average);
        System.out.println("Qualty points earned: " + points);
    }
}
