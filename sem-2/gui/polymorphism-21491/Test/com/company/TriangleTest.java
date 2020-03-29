package com.company;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class TriangleTest {
    Triangle a = new Triangle(2,3,4,1);

    @Test
    void getPerimeter() {
        assertEquals(9, a.getPerimeter());
    }

    @Test
    void getArea() {
        assertEquals(1.5, a.getArea());
    }

}