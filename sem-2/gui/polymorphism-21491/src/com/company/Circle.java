package com.company;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Circle implements GeometricPrimitive {
    private double r;

    public Circle() {
    }

    public Circle(double r) {
        this.r = r;
    }

    public double getR() {
        return this.r;
    }

    public void setR(double r) {
        this.r = r;
    }

    @Override
    public double getPerimeter() {
        return (double) (2 * Math.PI * r);
    }

    @Override
    public double getArea() {
        return (double) (Math.PI * r * r);
    }

    // proper format for serialization:
    // <geometric-primitive-type> <field1>=<value1> <field2>=<value2>
    public void serialize(FileWriter fw) {
        try (BufferedWriter bw = new BufferedWriter(fw)) {

            // Compose a String according to the format
            String res = this.getClass().getSimpleName().toLowerCase() + " " + "radius=" + this.r;

            // Perform the write
            bw.write(res);

        } catch (Exception e) {
            e.printStackTrace();
            System.exit(1);
        }
    }

    static Circle deserialize(FileReader fr) throws IOException {
        Circle tempCircle = new Circle();
        try (BufferedReader br = new BufferedReader(fr)) {
            String res = br.readLine();
            // Split the line
            String[] splitted = res.split("\\s+");
            // Check if the format is proper
            if (splitted[0].equals("circle") && splitted[1].startsWith("radius")) {

                // Get radius and set tempCircle's radius to the value found
                double r = Circle.findDouble(splitted[1]);
                tempCircle.setR(r);

            } else {
                throw new IOException(
                        "Invalid format! Proper format: <geometric-primitive-type> <field1>=<value1> <field2>=<value2>");
            }
        } catch (Exception e) {
            e.printStackTrace();
            System.exit(1);
        }
        return tempCircle;
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
