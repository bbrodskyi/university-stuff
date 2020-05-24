package com.company;

public class Parallelogram implements GeometricPrimitive {
    private double a;
    private double b;
    private double h;

    public Parallelogram(double a, double b, double h) {
        this.a = a;
        this.b = b;
        this.h = h;
    }

    @Override
    public double getPerimeter() {
        return 2 * (a + b);
    }

    @Override
    public double getArea() {
        return b * h;
    }
}
