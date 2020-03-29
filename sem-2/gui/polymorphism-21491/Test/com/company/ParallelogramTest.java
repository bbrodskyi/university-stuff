package com.company;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ParallelogramTest {
    Parallelogram a = new Parallelogram(2,3,2);

    @Test
    void getPerimeter() {
        assertEquals(10, a.getPerimeter());
    }

    @Test
    void getArea() {
        assertEquals(6, a.getArea());
    }

}