package com.company;

public class Triangle extends GeometricPrimitive {
    private double a;
    private double b;
    private double c;
    private double h;

    public Triangle(double a, double b, double c, double h) {
        this.a = a;
        this.b = b;
        this.c = c;
        this.h = h;
    }

    @Override
    public double getPerimeter() {
        return a + b +c;
    }

    @Override
    public double getArea() {
        return (b * h) / 2;
    }
}
