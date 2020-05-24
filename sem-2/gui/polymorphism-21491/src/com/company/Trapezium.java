package com.company;

public class Trapezium implements GeometricPrimitive {
    private double a;
    private double b;
    private double c;
    private double d;
    private double h;

    public Trapezium(double a, double b, double c, double d, double h) {
        this.a = a;
        this.b = b;
        this.c = c;
        this.d = d;
        this.h = h;
    }

    @Override
    public double getPerimeter() {
        return a + b + c + d;
    }

    @Override
    public double getArea() {
        return ((a + b) * h) / 2;
    }
}
