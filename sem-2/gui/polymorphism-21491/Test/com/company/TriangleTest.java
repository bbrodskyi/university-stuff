package com.company;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

import java.io.FileReader;
import java.io.FileWriter;

class TriangleTest {
    Triangle a = new Triangle(2, 3, 4, 1);

    @Test
    void getPerimeter() {
        assertEquals(9, a.getPerimeter());
    }

    @Test
    void getArea() {
        assertEquals(1.5, a.getArea());
    }

    @Test
    void serialize() {
        try (FileWriter out = new FileWriter("resources/objects.txt")) {
            a.serialize(out);
        } catch (Exception e) {
            e.printStackTrace();
            System.exit(1);
        }

        try (FileReader in = new FileReader("resources/objects.txt")) {
            a = Triangle.deserialize(in);
        } catch (Exception e) {
            e.printStackTrace();
            System.exit(1);
        }

        assertEquals(1.5, a.getArea());
    }
}