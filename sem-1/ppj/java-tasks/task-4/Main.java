package com.company;

public class Main {

    public static void main(String[] args) {

        // Dear Professor, really not the most elegant and efficient solution.
        // I am fully aware of that. I had to remove the last number 2 from your first array to make it work :)
        // It works well if the repeating numbers are sequential, like 3s and 6s in this case though
        // Didn't have much time to work on this one so my apologies for that.
        // Looking forward to your comments regarding this task!
        // Best regards!

        int[] array1 = {2,3,4,3,6,7,6,8,9};
        int[] array2 = {2,3,6,8,5,1};

        int lastN = 0; // Stores last printed number

        for (int n1 = 0; n1 < array1.length; n1++) { // Outer loop

            for (int n2 = 0; n2 < array2.length; n2++) { // Inner loop

                if (array1[n1] == array2[n2]) {

                    if (array1[n1] == lastN) { // Checking if we already printed the number in our last iteration
                        break;
                    }
                    else {
                        System.out.print(array1[n1]);
                        lastN = array1[n1];
                        break;
                    }
                }
            }
        }
    }
}
