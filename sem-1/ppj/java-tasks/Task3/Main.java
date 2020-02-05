package com.company;

import java.util.Scanner;

public class Main{
    public static void main(String[] args) {
        // Initiating Scanner, gathering input from a user
        Scanner scan = new Scanner(System.in);
        System.out.println("Please enter an odd natural number: ");
        int inputNumber = scan.nextInt();
        scan.close();

        // Checking if the number is actually odd
        if ((inputNumber % 2) != 0) {
            // Setting a variable to track spacing
            int leftSpacing = 0;
            // Actually doing the printouts
            while (inputNumber > 0) {
                for (int j = 0; j < leftSpacing; j++) {
                    System.out.print(" ");
                }
                for (int i = 0; i < inputNumber; i++) {
                    System.out.print("*");
                }
                // Setting the cursor to the next line
                System.out.println();

                // Adjusting variables for further iterations
                inputNumber -= 2;
                leftSpacing++;
            }
        } else {
            // Instructions for even number gets inputted
            System.out.println("Number is not odd. Launch again");
            System.exit(1);
        }

    }
}