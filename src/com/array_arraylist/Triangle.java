package com.array_arraylist;

import java.util.Arrays;
import java.util.List;

public class Triangle {
    public static void main(String[] args) {
        int [][] triangle = {{-1},{2,3},{1,-1,-3}};
        System.out.println(minimumTotal(triangle));
    }
    static int minimumTotal(int [][] triangle) {
        int min = Integer.MAX_VALUE;
        int sum = 0;

        for(int [] i : triangle)
        {   min = Integer.MAX_VALUE;
            for(int j : i )
            {
                min = Math.min(j,min);
            }
            sum += min;
        }
        return sum;
    }
}
