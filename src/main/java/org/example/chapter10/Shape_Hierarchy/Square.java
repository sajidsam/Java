package org.example.chapter10.Shape_Hierarchy;

class Square extends TwoDimensionalShape {
    private double side;

    public Square(double side) {
        this.side = side;
    }

    @Override
    public String getName() {
        return "Square";
    }

    @Override
    public double getArea() {
        return side * side;
    }
}