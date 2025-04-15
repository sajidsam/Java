package org.example.chapter6;

import java.util.Scanner;

public class Circle_Area {
    public double area(double radius){
        double pie=Math.PI;
        double ans=pie*Math.pow(radius,2);
        return ans;
    }

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        Circle_Area CR=new Circle_Area();

        System.out.println("Enter The Radius Of the Cirle ");
        double R=sc.nextDouble();
        System.out.println(" Area of the circle is: "+CR.area(R)+" Squre unit");

    }
}
