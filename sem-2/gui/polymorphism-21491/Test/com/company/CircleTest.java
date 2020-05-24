package com.company;

import static org.junit.jupiter.api.Assertions.*;

import java.io.FileReader;
import java.io.FileWriter;

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

    @Test
    void serialize() {
        try (FileWriter out = new FileWriter("resources/objects.txt")) {
            a.serialize(out);
        } catch (Exception e) {
            e.printStackTrace();
            System.exit(1);
        }

        try (FileReader in = new FileReader("resources/objects.txt")) {
            a = Circle.deserialize(in);
        } catch (Exception e) {
            e.printStackTrace();
            System.exit(1);
        }

        assertEquals(28.274333882308138, a.getArea());
    }
}