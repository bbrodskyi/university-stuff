package com.company;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class MainTest {
    GeometricPrimitive[] arr = {
            new Rectangle(2,4),
            new Square(4),
            new Circle(2),
            new Diamond(2,4),
            new Parallelogram(2,4,1),
            new Triangle(2,3,4,1),
            new Trapezium(2,4,3,3,2)
    };

    @Test
    void testTotalPerimeter() {
        assertEquals(85.56637061435917, totalPerimeter(arr));
    }

    @Test
    void testTotalArea() {
        assertEquals(56.06637061435917, totalArea(arr));
    }

    double totalPerimeter(GeometricPrimitive[] arr) {
        double totalP = 0;
        for (int i = 0; i < arr.length; i++) {
            totalP += arr[i].getPerimeter();
        }
        return totalP;
    }

    double totalArea(GeometricPrimitive[] arr) {
        double totalA = 0;
        for (int i = 0; i < arr.length; i++) {
            totalA += arr[i].getArea();
        }
        return totalA;
    }
}

