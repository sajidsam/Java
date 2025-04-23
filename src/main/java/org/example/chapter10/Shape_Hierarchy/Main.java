package org.example.chapter10.Shape_Hierarchy;

public class Main {
    public static void main(String[] args) {
        Shape[] shapes = {
                new Circle(5),
                new Square(4),
                new Triangle(3, 6),
                new Sphere(3),
                new Cube(2),
                new Tetrahedron(4)
        };

        for (Shape shape : shapes) {
            System.out.println("Shape: " + shape.getName());
            if (shape instanceof TwoDimensionalShape) {
                System.out.printf("Area: %.2f\n", ((TwoDimensionalShape) shape).getArea());
            } else if (shape instanceof ThreeDimensionalShape) {
                System.out.printf("Surface Area: %.2f\n", ((ThreeDimensionalShape) shape).getArea());
                System.out.printf("Volume: %.2f\n", ((ThreeDimensionalShape) shape).getVolume());
            }
            System.out.println();
        }
    }
}
