package org.example.chapter10.Shape_Hierarchy;

class Tetrahedron extends ThreeDimensionalShape {
    private double edge;

    public Tetrahedron(double edge) {
        this.edge = edge;
    }

    @Override
    public String getName() {
        return "Tetrahedron";
    }

    @Override
    public double getArea() {
        return Math.sqrt(3) * edge * edge;
    }

    @Override
    public double getVolume() {
        return (Math.pow(edge, 3)) / (6 * Math.sqrt(2));
    }
}