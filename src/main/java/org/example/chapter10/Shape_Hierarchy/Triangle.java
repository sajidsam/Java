package org.example.chapter10.Shape_Hierarchy;

class Triangle extends TwoDimensionalShape {
    private double base, height;

    public Triangle(double base, double height) {
        this.base = base;
        this.height = height;
    }

    @Override
    public String getName() {
        return "Triangle";
    }

    @Override
    public double getArea() {
        return 0.5 * base * height;
    }
}
