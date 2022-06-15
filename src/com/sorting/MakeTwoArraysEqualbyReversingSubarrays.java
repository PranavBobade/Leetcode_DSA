package com.sorting;

import java.util.Arrays;

public class MakeTwoArraysEqualbyReversingSubarrays {
    public static void main(String[] args) {

      int []  target = {1,2,3,4}, arr = {2,4,1,3};
        System.out.println(canBeEqual(target,arr));
    }
    static boolean canBeEqual(int[] target, int[] arr) {

        Arrays.sort(target);
        Arrays.sort(arr);

        for(int i = 0; i < arr.length; i++)
        {

            if(target[i] != arr[i])
                return false;

        }
        return true;
    }
}
