package com.company;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        int[][] a = {
                { 1, 2, 3, 4, 5, 6, 5, 6 },
                { 2, 3, 4, 5, 6, 7, 6, 7 },
                { 3, 4, 5, 6, 7, 8, 7, 8 },
                { 4, 5, 6, 7, 8, 9, 8, 9 },
                { 3, 4, 5, 6, 7, 8, 8, 9 },
                { 4, 5, 6, 7, 8, 9, 8, 9 },
        };
        for (int[] r : a)
            System.out.println(Arrays.toString(r));
        System.out.println();
        for (int[] r : inner(a))
            System.out.println(Arrays.toString(r));
    }

    public static int[][] inner(int[][] a) {

        //assuming that our array is rectangular, x in [a[x].length - 2] can be any number, as long as it is < a.length - 1
        int[][] toReturn = new int[a.length - 2][a[0].length - 2];

        for (int x = 1; x < a.length - 1; x++) {
            for (int y = 1; y < a[x].length - 1; y++) {
                toReturn[x - 1][y - 1] = a[x][y];
            }
        }
        return toReturn;
    }
}
