package com.sorting;

import java.util.Arrays;

public class MatrixCellsinDistanceOrder {
    public static void main(String[] args) {
       int rows = 1, cols = 2, rCenter = 0, cCenter = 0;
        for (int num []: allCellsDistOrder(rows, cols,rCenter,cCenter)) {
                System.out.print(Arrays.toString(num));
            }


        }

    static int[][] allCellsDistOrder(int rows, int cols, int rCenter, int cCenter) {
        int [][] ans = new int [rows*cols][2];
        // creating an 2d array to store coordinates / total pairs(i,j)
        for(int i = 0; i < rows; i++)
        {
            for(int j = 0; j < cols; j++)
            {
                int bno = i * cols + j; //ans. array index
                ans[bno][0] = i;
                ans[bno][1] = j;
            }
        }

        Arrays.sort(ans,(a, b) ->{
            int d1 = Math.abs(a[0] - rCenter) + Math.abs(a[1] - cCenter);
            int d2 = Math.abs(b[0] - rCenter) + Math.abs(b[1] - cCenter);

            return d1 - d2;
        });
        // (a,b) is each 1d array on ans array's index

        return ans;
    }
}
