package org.example.chapter9;

public class Trapezoid extends Quadrilateral{
    public Trapezoid(Point p1, Point p2, Point p3, Point p4) {
        super(p1, p2, p3, p4);
    }

    public double getArea() {
        double base1 = Math.abs(p2.getX() - p1.getX());
        double base2 = Math.abs(p4.getX() - p3.getX());
        double height = Math.abs(p3.getY() - p1.getY());
        return 0.5 * (base1 + base2) * height;
    }
}
