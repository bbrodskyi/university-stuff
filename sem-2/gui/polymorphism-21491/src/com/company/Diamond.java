package com.company;

public class Diamond extends GeometricPrimitive {
    private double a;
    private double b;

    public Diamond (double a, double b) {
        this.a = a;
        this.b = b;
    }

    @Override
    public double getPerimeter() {
        return 2 * (a + b);
    }

    @Override
    public double getArea() {
        return a  * b;
    }
}
