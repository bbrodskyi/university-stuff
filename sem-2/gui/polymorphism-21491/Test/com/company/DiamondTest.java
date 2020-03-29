package com.company;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class DiamondTest {
    Diamond d = new Diamond(3,4);

    @Test
    void getPerimeter() {
        assertEquals(14, d.getPerimeter());
    }

    @Test
    void getArea() {
        assertEquals(12, d.getArea());
    }
}