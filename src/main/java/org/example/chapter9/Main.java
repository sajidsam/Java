package org.example.chapter9;

public class Main {
    public static void main(String[] args) {
        Trapezoid trap = new Trapezoid(new Point(0, 0), new Point(4, 0), new Point(1, 3), new Point(3, 3));
        System.out.println("Trapezoid Area: " + trap.getArea());

        Parallelogram para = new Parallelogram(new Point(0, 0), new Point(5, 0), new Point(1, 3), new Point(6, 3));
        System.out.println("Parallelogram Area: " + para.getArea());

        Rectangle rect = new Rectangle(new Point(0, 0), new Point(4, 0), new Point(0, 3), new Point(4, 3));
        System.out.println("Rectangle Area: " + rect.getArea());

        Square sq = new Square(new Point(0, 0), new Point(2, 0), new Point(0, 2), new Point(2, 2));
        System.out.println("Square Area: " + sq.getArea());
    }
}
