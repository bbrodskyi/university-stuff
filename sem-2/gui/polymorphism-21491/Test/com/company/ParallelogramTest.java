package com.company;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

import java.io.FileReader;
import java.io.FileWriter;

class ParallelogramTest {
    Parallelogram a = new Parallelogram(2, 3, 2);

    @Test
    void getPerimeter() {
        assertEquals(10, a.getPerimeter());
    }

    @Test
    void getArea() {
        assertEquals(6, a.getArea());
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
            a = Parallelogram.deserialize(in);
        } catch (Exception e) {
            e.printStackTrace();
            System.exit(1);
        }

        assertEquals(6, a.getArea());
    }

}