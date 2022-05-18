package com.Pranav;

import java.util.Arrays;
// here array is sorted row-wise and column-wise so we can't apply B.S
public class rowColumnSortedMatrix {
    public static void main(String[] args) {
        int a[][]={
                {10,20,30,40},
                {15,25,35,45},
                {28,29,37,49},
                {33,34,38,50}
        };
        System.out.println(Arrays.toString(search(a,39)));
    }
    static int[] search(int[][]matrix,int target)
    {
        int r=0;
        int c=matrix.length-1;

        while(r<matrix.length && c>=0)
        {
            if(matrix[r][c]==target)
                return new int[]{r,c};
            else if(matrix[r][c]>target)
                c--;         //skip column
            else
                r++;      //skip row

        }
        return new int[]{-1,-1};
    }
}
