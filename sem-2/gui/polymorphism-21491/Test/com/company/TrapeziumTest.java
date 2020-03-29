package com.company;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class TrapeziumTest {
    Trapezium a = new Trapezium(2,4,4,4,3);

    @Test
    void getPerimeter() {
        assertEquals(14, a.getPerimeter());
    }

    @Test
    void getArea() {
        assertEquals(9, a.getArea());
    }
}