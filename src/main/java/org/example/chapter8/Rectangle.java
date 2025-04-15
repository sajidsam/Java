package org.example.chapter8;

import java.util.Scanner;

public class Rectangle {
    static double length = 1.0;
    static double width = 1.0;

    public static void setLength(double l) {
        if (l > 0.0 && l < 20.0) {
            length = l;
        } else {
            System.out.println("length invalid");
        }
    }

    public static void setWidth(double w) {
        if (w > 0.0 && w < 20.0) {
            width = w;
        } else {
            System.out.println("width invalid");
        }
    }

    public static double getLength() {
        return length;
    }

    public static double getWidth() {
        return width;
    }

    public static double calculateArea() {
        return length * width;
    }

    public static double calculatePerimeter() {
        return 2 * (length + width);
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("enter length: ");
        setLength(scanner.nextDouble());

        System.out.print("enter width: ");
        setWidth(scanner.nextDouble());

        System.out.println("length is: " + getLength());
        System.out.println("width is: " + getWidth());
        System.out.println("area is: " + calculateArea());
        System.out.println("perimeter is: " + calculatePerimeter());
    }
}
