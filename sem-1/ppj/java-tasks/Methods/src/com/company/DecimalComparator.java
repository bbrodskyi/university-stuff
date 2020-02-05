package com.company;

import java.math.BigDecimal;
import java.math.MathContext;

public class DecimalComparator {
    public static void main(String[] args) {
        System.out.println(areEqualByThreeDecimalPlaces(-3.1756, -3.175));
//        System.out.println(areEqualByThreeDecimalPlaces(3.175, -3.176));
//        System.out.println(areEqualByThreeDecimalPlaces(3.0, 3.0));
//        System.out.println(areEqualByThreeDecimalPlaces(-3.123, 3.123));

    }
    public static boolean areEqualByThreeDecimalPlaces(double valueOne, double valueTwo) {
        boolean areEqual = false;
        MathContext m = new MathContext(3);
        BigDecimal vOne = new BigDecimal(valueOne);
        BigDecimal vTwo = new BigDecimal(valueTwo);
        vOne = vOne.round(m);
        vTwo = vTwo.round(m);
        if (vOne.equals(vTwo)) {
            areEqual = true;
        }
        return areEqual;
//       return areEqual;
//        areEqual = false;
//        String compareOne = "";
//        String compareTwo = "";
//        String vOne = String.valueOf(valueOne);
//        String vTwo = String.valueOf(valueTwo);
//
//        if (vOne.length() <= 3) {
//            for (int i = 0; i <= 3; i++) {
//                compareOne += vOne.charAt(i);
//            }
//        } else if (vOne.length() <= 4) {
//            for (int i = 0; i <= 4; i++) {
//                compareOne += vOne.charAt(i);
//            }
//        } else if (vOne.length() <= 5) {
//            for (int i = 0; i <= 5; i++) {
//                compareOne += vOne.charAt(i);
//            }
//        } else if (vOne.length() <= 6) {
//            for (int i = 0; i <= 6; i++) {
//                compareOne += vOne.charAt(i);
//            }
//        } else if (vTwo.length() <= 3) {
//            for (int i = 0; i <= 3; i++) {
//                compareTwo += vTwo.charAt(i);
//            }
//        } else if (vTwo.length() <= 4) {
//            for (int i = 0; i <= 4; i++) {
//                compareTwo += vTwo.charAt(i);
//            }
//        } else if (vTwo.length() <= 5) {
//            for (int i = 0; i <= 5; i++) {
//                compareTwo += vTwo.charAt(i);
//            }
//        } else if (vTwo.length() <= 6) {
//            for (int i = 0; i <= 6; i++) {
//                compareTwo += vTwo.charAt(i);
//            }
//        }
//        System.out.println(compareOne);
//        System.out.println(compareTwo);
//        if (compareOne.equals(compareTwo)) {
//            areEqual = true;
//        }
    }
}
//    boolean areEqual = false;
//        MathContext m = new MathContext(3);
//        BigDecimal vOne = new BigDecimal(valueOne);
//        BigDecimal vTwo = new BigDecimal(valueTwo);
//        vOne = vOne.round(m);
//        vTwo = vTwo.round(m);
//        if (vOne.equals(vTwo)) {
//            areEqual = true;
//        }
//        return areEqual;
