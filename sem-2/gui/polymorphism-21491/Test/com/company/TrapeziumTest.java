package com.company;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

import java.io.FileReader;
import java.io.FileWriter;

class TrapeziumTest {
    Trapezium a = new Trapezium(2, 4, 4, 4, 3);

    @Test
    void getPerimeter() {
        assertEquals(14, a.getPerimeter());
    }

    @Test
    void getArea() {
        assertEquals(9, a.getArea());
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
            a = Trapezium.deserialize(in);
        } catch (Exception e) {
            e.printStackTrace();
            System.exit(1);
        }

        assertEquals(9, a.getArea());
    }
}