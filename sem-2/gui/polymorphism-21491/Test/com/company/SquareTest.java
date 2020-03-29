package com.company;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SquareTest {
    Square a = new Square(4);
    @Test
    void getPerimeter() {
        assertEquals(16,a.getArea());
    }

    @Test
    void getArea() {
        assertEquals(16,a.getPerimeter());
    }
}