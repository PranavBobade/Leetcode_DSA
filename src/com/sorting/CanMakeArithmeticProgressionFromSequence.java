package com.sorting;

import java.util.Arrays;

public class CanMakeArithmeticProgressionFromSequence {
    public static void main(String[] args) {
       int [] arr = {3,5,1};
        System.out.println(canMakeArithmeticProgression(arr));
    }
    static boolean canMakeArithmeticProgression(int[] arr) {
        Arrays.sort(arr);
        int j = 1;
        int x = Math.abs(arr[0]-arr[1]);
        for(int i = 0; i <arr.length-1 && j< arr.length; i++)
        {
            if(Math.abs(arr[i]-arr[j]) != x)
            {

                return false;
            }
            j++;
        }
        return true;
    }
}
