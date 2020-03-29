package com.company;

public class Circle extends GeometricPrimitive {
    private double r;

    public Circle (double r) {
        this.r = r;
    }

    @Override
    public double getPerimeter() {
        return (double) (2 * Math.PI * r);
    }

    @Override
    public double getArea() {
        return (double) (Math.PI * r * r);
    }
}
