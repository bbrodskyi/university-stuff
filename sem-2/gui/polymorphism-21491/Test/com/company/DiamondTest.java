package com.company;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

import java.io.FileReader;
import java.io.FileWriter;

class DiamondTest {
    Diamond d = new Diamond(3, 4);

    @Test
    void getPerimeter() {
        assertEquals(14, d.getPerimeter());
    }

    @Test
    void getArea() {
        assertEquals(12, d.getArea());
    }

    @Test
    void serialize() {
        try (FileWriter out = new FileWriter("resources/objects.txt")) {
            d.serialize(out);
        } catch (Exception e) {
            e.printStackTrace();
            System.exit(1);
        }

        try (FileReader in = new FileReader("resources/objects.txt")) {
            d = Diamond.deserialize(in);
        } catch (Exception e) {
            e.printStackTrace();
            System.exit(1);
        }

        assertEquals(12, d.getArea());
    }
}