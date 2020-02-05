package com.company;
public class SpeedConverter {
    public static void main(String[] args) {
        long test1 = toMilesPerHour(95.75);
        System.out.println(test1);
        printConversion(-2);
        printConversion(95.75);
        printConversion(1.5);
        printConversion(10.25);
        printConversion(25.42);


    }

    public static long toMilesPerHour(double kilometersPerHour) {
        long milesPerHour;
        if (kilometersPerHour < 0) {
            return -1;
        }
        double multiplier = 0.625;
        milesPerHour = Math.round(kilometersPerHour * multiplier);
        return milesPerHour;
    }
    public static void printConversion(double kilometersPerHour) {
        if (kilometersPerHour < 0) {
            System.out.println("Invalid Value");
        } else {
            long milesPerHour = toMilesPerHour(kilometersPerHour);
            System.out.println(kilometersPerHour + " km/h = " + milesPerHour + " mi/h");
        }
    }
}