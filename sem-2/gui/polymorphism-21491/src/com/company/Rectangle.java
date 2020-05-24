package com.company;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Rectangle implements GeometricPrimitive {
    private double h;
    private double l;

    public Rectangle() {

    }

    public Rectangle(double h, double l) {
        this.h = h;
        this.l = l;
    }

    public double getH() {
        return this.h;
    }

    public void setH(double h) {
        this.h = h;
    }

    public double getL() {
        return this.l;
    }

    public void setL(double l) {
        this.l = l;
    }

    @Override
    public double getPerimeter() {
        return 2 * (h + l);
    }

    @Override
    public double getArea() {
        return l * h;
    }

    // proper format for serialization:
    // <geometric-primitive-type> <field1>=<value1> <field2>=<value2>
    public void serialize(FileWriter fw) {
        try (BufferedWriter bw = new BufferedWriter(fw)) {

            // Compose a String according to the format
            String res = this.getClass().getSimpleName().toLowerCase() + " " + "h=" + this.h + " " + "l=" + this.l;

            // Perform the write
            bw.write(res);

        } catch (Exception e) {
            e.printStackTrace();
            System.exit(1);
        }
    }

    static Rectangle deserialize(FileReader fr) throws IOException {
        Rectangle tempRectangle = new Rectangle();
        try (BufferedReader br = new BufferedReader(fr)) {

            // Read the line
            String res = br.readLine();

            // Split the line
            String[] splitted = res.split("\\s+");

            // Check if the format is proper
            if (splitted[0].equals("rectangle") && splitted[1].startsWith("h") && splitted[2].startsWith("l")) {

                // Get h and set tempRectangle's h to the value found
                double h = Rectangle.findDouble(splitted[1]);
                tempRectangle.setH(h);

                // Get l and set tempRectangle's l to the value found
                double l = Rectangle.findDouble(splitted[2]);
                tempRectangle.setL(l);

                // throw an IOException if the format is wrong
            } else {
                throw new IOException(
                        "Invalid format! Proper format: <geometric-primitive-type> <field1>=<value1> <field2>=<value2>");
            }
        } catch (Exception e) {
            e.printStackTrace();
            System.exit(1);
        }
        return tempRectangle;
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
