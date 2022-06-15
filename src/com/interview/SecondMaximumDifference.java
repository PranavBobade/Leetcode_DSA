package com.interview;
//RSL-1
//A-1: Write a function that takes an array of integers as input and prints the second-maximum difference between any two elements from an array.
//
//        Example:
//        int arr[]={14, 12, 70, 15, 95, 65, 22, 30};
//        First max-difference = 95-12=83
//        Second max-difference = 95 -14 = 81
//        So output should be 81


import java.lang.reflect.Array;
import java.util.Arrays;

public class SecondMaximumDifference {
    public static void main(String args[]) {
        int arr[] = {14, 12, 70, 15, 95, 65, 22, 30};

        System.out.println(diff(arr));
    }

    static int diff(int a[]) {

//                 if(a.length == 0)
//                         return 0;
//                 Arrays.sort(a);
//           return a[a.length-1] - a[1];
//~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~
        int max = Integer.MIN_VALUE;
        int min1 = Integer.MAX_VALUE; //int arr[] = {14, 12, 70, 15, 95, 65, 22, 30};
        int min2 = Integer.MAX_VALUE;
        for (int i = 0; i < a.length; i++) {
            if (a[i] > max) {
                max = a[i];

            }
            if (a[i] < min1) {
                min2 = min1;
                min1 = a[i];
            } else if (a[i] < min2 && a[i] != min1) {
                min2 = a[i];
            }

        }
//        System.out.println(max);
//        System.out.println(min2);

        return max - min2;

    }

}
