package com.company;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        // Initiating Scanner, gathering input from a user
        Scanner scan = new Scanner(System.in);
        System.out.println("Please input a string: ");
        String userInput = scan.next();
        scan.close();

        // Setting basic variables for future calculations and loops
        int inputLength = userInput.length();
        int enclosingLength = inputLength + 6;
        int emptyBufferLength = enclosingLength - 1;

        // Setting printable Strings. Our 'rows' basically
        String enclosingRow = "*";
        String bufferRow = "*";
        String inputRow = "*  ";

        // enclosingRow concatenated with stars, based on the length required
        for (int i = 1; i < enclosingLength; i++){
            enclosingRow += "*";
        }

        // bufferRow concatenated with spaces, based on the length required
        for (int i = 1; i < emptyBufferLength; i++){
            bufferRow += " ";
        }

        // Final adjustments of the printable Strings
        bufferRow += "*";
        inputRow += userInput;
        inputRow += "  *";

        // Actually printing rows here
        System.out.println(enclosingRow);
        System.out.println(bufferRow);
        System.out.println(inputRow);
        System.out.println(bufferRow);
        System.out.println(enclosingRow);

    }
}
