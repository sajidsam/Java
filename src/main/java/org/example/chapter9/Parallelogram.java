package org.example.chapter9;

public class Parallelogram extends Quadrilateral {
    public Parallelogram(Point p1, Point p2, Point p3, Point p4) {
        super(p1, p2, p3, p4);
    }

    public double getArea() {
        double base = Math.abs(p2.getX() - p1.getX());
        double height = Math.abs(p3.getY() - p1.getY());
        return base * height;
    }
}
