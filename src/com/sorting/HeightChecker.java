package com.sorting;

import java.util.Arrays;

public class HeightChecker {
    public static void main(String[] args) {
     int []   heights = {1,1,4,2,1,3};
        System.out.println(heightChecker(heights));
    }
    static int heightChecker(int[] heights) {
        int a[]= new int [heights.length];
        for(int i = 0; i < a.length; i++)
        {
            a[i] = heights[i];
        }
        Arrays.sort(heights);
        int count = 0;
        for(int i = 0; i < a.length; i++)
        {
            if(heights[i] != a[i])
                count++;
        }
        return count;
    }
}
