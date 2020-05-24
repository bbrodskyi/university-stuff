package com.company;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Triangle implements GeometricPrimitive {
    private double a;
    private double b;
    private double c;
    private double h;

    public Triangle() {

    }

    public Triangle(double a, double b, double c, double h) {
        this.a = a;
        this.b = b;
        this.c = c;
        this.h = h;
    }

    public double getA() {
        return this.a;
    }

    public void setA(double a) {
        this.a = a;
    }

    public double getB() {
        return this.b;
    }

    public void setB(double b) {
        this.b = b;
    }

    public double getC() {
        return this.c;
    }

    public void setC(double c) {
        this.c = c;
    }

    public double getH() {
        return this.h;
    }

    public void setH(double h) {
        this.h = h;
    }

    @Override
    public double getPerimeter() {
        return a + b + c;
    }

    @Override
    public double getArea() {
        return (b * h) / 2;
    }

    // proper format for serialization:
    // <geometric-primitive-type> <field1>=<value1> <field2>=<value2>
    public void serialize(FileWriter fw) {
        try (BufferedWriter bw = new BufferedWriter(fw)) {

            // Compose a String according to the format
            String res = this.getClass().getSimpleName().toLowerCase() + " " + "a=" + this.a + " " + "b=" + this.b + " "
                    + "c=" + this.c + " " + "h=" + this.h;

            // Perform the write
            bw.write(res);

        } catch (Exception e) {
            e.printStackTrace();
            System.exit(1);
        }
    }

    static Triangle deserialize(FileReader fr) throws IOException {
        Triangle tempTriangle = new Triangle();
        try (BufferedReader br = new BufferedReader(fr)) {

            // Read the line
            String res = br.readLine();

            // Split the line
            String[] splitted = res.split("\\s+");

            // Check if the format is proper
            if (splitted[0].equals("triangle") && splitted[1].startsWith("a") && splitted[2].startsWith("b")
                    && splitted[3].startsWith("c") && splitted[4].startsWith("h")) {

                // Get a and set tempTriangle's a to the value found
                double a = Triangle.findDouble(splitted[1]);
                tempTriangle.setA(a);

                // Get b and set tempTriangle's b to the value found
                double b = Triangle.findDouble(splitted[2]);
                tempTriangle.setB(b);

                // Get c and set tempTriangle's c to the value found
                double c = Triangle.findDouble(splitted[3]);
                tempTriangle.setC(c);

                // Get h and set tempTriangle's h to the value found
                double h = Triangle.findDouble(splitted[4]);
                tempTriangle.setH(h);

                // throw an IOException if the format is wrong
            } else {
                throw new IOException(
                        "Invalid format! Proper format: <geometric-primitive-type> <field1>=<value1> <field2>=<value2>");
            }
        } catch (Exception e) {
            e.printStackTrace();
            System.exit(1);
        }
        return tempTriangle;
    }

    private static double findDouble(String source) {
        // Takes a String as an argument and finds a double in the provided String
        String temp = "";
        Matcher m = Pattern.compile("\\d+\\.\\d+").matcher(source);
        while (m.find()) {
            temp = m.group();
        }
        double value = Double.parseDouble(temp);
        return value;
    }

}
