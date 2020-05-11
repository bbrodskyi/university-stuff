package com.company;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class CircleTest {
    Circle a = new Circle(3);

    @Test
    void getPerimeter() {
        assertEquals(18.84955592153876, a.getPerimeter());
    }

    @Test
    void getArea() {
        assertEquals(28.274333882308138, a.getArea());
    }
}