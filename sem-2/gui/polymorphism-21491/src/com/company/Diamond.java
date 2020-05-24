package com.company;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Diamond implements GeometricPrimitive {
    private double a;
    private double b;

    public double getA() {
        return this.a;
    }

    public void setA(double a) {
        this.a = a;
    }

    public Diamond() {
    }

    public Diamond(double a, double b) {
        this.a = a;
        this.b = b;
    }

    @Override
    public double getPerimeter() {
        return 2 * (a + b);
    }

    @Override
    public double getArea() {
        return a * b;
    }

    public double getB() {
        return this.b;
    }

    public void setB(double b) {
        this.b = b;
    }

    // proper format for serialization:
    // <geometric-primitive-type> <field1>=<value1> <field2>=<value2>
    public void serialize(FileWriter fw) {
        try (BufferedWriter bw = new BufferedWriter(fw)) {

            // Compose a String according to the format
            String res = this.getClass().getSimpleName().toLowerCase() + " " + "a=" + this.a + " " + "b=" + this.b;

            // Perform the write
            bw.write(res);

        } catch (Exception e) {
            e.printStackTrace();
            System.exit(1);
        }
    }

    static Diamond deserialize(FileReader fr) throws IOException {
        Diamond tempDiamond = new Diamond();
        try (BufferedReader br = new BufferedReader(fr)) {

            // Read the line
            String res = br.readLine();

            // Split the line
            String[] splitted = res.split("\\s+");

            // Check if the format is proper
            if (splitted[0].equals("diamond") && splitted[1].startsWith("a") && splitted[2].startsWith("b")) {

                // Get a and set tempDiamond's a to the value found
                double a = Diamond.findDouble(splitted[1]);
                tempDiamond.setA(a);

                // Get b and set tempDiamond's b to the value found
                double b = Diamond.findDouble(splitted[2]);
                tempDiamond.setB(b);

                // throw an IOException if the format is wrong
            } else {
                throw new IOException(
                        "Invalid format! Proper format: <geometric-primitive-type> <field1>=<value1> <field2>=<value2>");
            }
        } catch (Exception e) {
            e.printStackTrace();
            System.exit(1);
        }
        return tempDiamond;
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
