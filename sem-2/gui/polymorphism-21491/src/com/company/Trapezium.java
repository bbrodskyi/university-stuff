package com.company;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Trapezium implements GeometricPrimitive {
    private double a;
    private double b;
    private double c;
    private double d;
    private double h;

    public Trapezium() {

    }

    public Trapezium(double a, double b, double c, double d, double h) {
        this.a = a;
        this.b = b;
        this.c = c;
        this.d = d;
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

    public double getD() {
        return this.d;
    }

    public void setD(double d) {
        this.d = d;
    }

    public double getH() {
        return this.h;
    }

    public void setH(double h) {
        this.h = h;
    }

    @Override
    public double getPerimeter() {
        return a + b + c + d;
    }

    @Override
    public double getArea() {
        return ((a + b) * h) / 2;
    }

    // proper format for serialization:
    // <geometric-primitive-type> <field1>=<value1> <field2>=<value2>
    public void serialize(FileWriter fw) {
        try (BufferedWriter bw = new BufferedWriter(fw)) {

            // Compose a String according to the format
            String res = this.getClass().getSimpleName().toLowerCase() + " " + "a=" + this.a + " " + "b=" + this.b + " "
                    + "c=" + this.c + " " + "d=" + this.d + " " + "h=" + this.h;

            // Perform the write
            bw.write(res);

        } catch (Exception e) {
            e.printStackTrace();
            System.exit(1);
        }
    }

    static Trapezium deserialize(FileReader fr) throws IOException {
        Trapezium tempTrapezium = new Trapezium();
        try (BufferedReader br = new BufferedReader(fr)) {

            // Read the line
            String res = br.readLine();

            // Split the line
            String[] splitted = res.split("\\s+");

            // Check if the format is proper
            if (splitted[0].equals("trapezium") && splitted[1].startsWith("a") && splitted[2].startsWith("b")
                    && splitted[3].startsWith("c") && splitted[4].startsWith("d") && splitted[5].startsWith("h")) {

                // Get a and set tempTrapezium's a to the value found
                double a = Trapezium.findDouble(splitted[1]);
                tempTrapezium.setA(a);

                // Get b and set tempTrapezium's b to the value found
                double b = Trapezium.findDouble(splitted[2]);
                tempTrapezium.setB(b);

                // Get c and set tempTrapezium's c to the value found
                double c = Trapezium.findDouble(splitted[3]);
                tempTrapezium.setC(c);

                // Get d and set tempTrapezium's d to the value found
                double d = Trapezium.findDouble(splitted[4]);
                tempTrapezium.setD(d);

                // Get h and set tempTrapezium's h to the value found
                double h = Trapezium.findDouble(splitted[5]);
                tempTrapezium.setH(h);

                // throw an IOException if the format is wrong
            } else {
                throw new IOException(
                        "Invalid format! Proper format: <geometric-primitive-type> <field1>=<value1> <field2>=<value2>");
            }
        } catch (Exception e) {
            e.printStackTrace();
            System.exit(1);
        }
        return tempTrapezium;
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
