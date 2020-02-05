package com.company;

import java.util.Scanner;
import java.lang.Math;

public class Main {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.println("Input a string");

        String userString = scan.next();
        scan.close();

        String empty = " ";
        String star = "*";
        String opener = userString.length();

        System.out.println(empty + empty);

        String openingLine = "*";

        int greatest = Math.max(Math.max(valueOne, valueTwo), valueThree);

        System.out.println("Greatest value : ");

        for (int i = 0; i < greatest; i++) {
            var firstCharacter = " ";
            var secondCharacter = " ";
            var thirdCharacter = " ";
            if (valueOne - (greatest - i) >= 0) {
                firstCharacter = "*";
            }
            if (valueTwo - (greatest - i) >= 0) {
                secondCharacter = "*";
            }
            if (valueThree - (greatest - i) >= 0) {
                thirdCharacter = "*";
            }
            System.out.println(firstCharacter + " " + secondCharacter + " " + thirdCharacter);

        }
    }
}
