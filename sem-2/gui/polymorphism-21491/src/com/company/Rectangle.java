package com.company;

public class Rectangle extends GeometricPrimitive {
    private double h;
    private double l;

    public Rectangle (double h, double l) {
        this.h = h;
        this.l = l;
    }

    @Override
    public double getPerimeter() {
        return 2 * (h + l);
    }

    @Override
    public double getArea() {
        return l * h;
    }
}
