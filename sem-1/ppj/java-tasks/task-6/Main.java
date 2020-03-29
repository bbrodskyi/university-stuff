package com.company;

import java.util.Arrays;

public class Main {

    public static void main(String[] args) {

        int[][][] opers = {
                { { 100, -50, 25 }, { 150, -300 }, { 300, -90, 100 } },
                { { 90, -60, 250 }, { 300, 20, -100 } },
                { { 20, 50 }, { 300 }, { 20, -20, 40 }, { 100, -200 } }
        };

        int[] sums = new int[opers.length];

        for (int i = 0; i < opers.length; i++) {
            for (int j = 0; j < opers[i].length; j++) {
                for (int k = 0; k < opers[i][j].length; k++) {
                            sums[i] += opers[i][j][k];
                }
            }
        }

        System.out.print(Arrays.toString(sums));
    }
}
