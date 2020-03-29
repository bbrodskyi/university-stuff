package com.company;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class RectangleTest {
    Rectangle a = new Rectangle(2,4);

    @Test
    void getPerimeter() {
        assertEquals(12, a.getPerimeter());
    }

    @Test
    void getArea() {
        assertEquals(8, a.getArea());
    }
}