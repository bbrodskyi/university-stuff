package com.company;

interface GeometricPrimitive {

    public double getPerimeter();

    public double getArea();

    public void serialize();

    public GeometricPrimitive deserialize();

}
