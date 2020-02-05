package com.company;

public class Draft {
    public static void main(String[] args) {
        int[] arr1 = {2,3,4,3,6,7,6,8,2,9};
        int[] arr2 = {2,3,6,8,5,1};

        for(int i = 0;i < arr1.length; i++) {
            for(int j = 0; j < arr2.length; j++) {
                if(arr1[i] == arr2[j]) {
                    System.out.println(arr1[i]);
                }
            }
        }
    }
}
