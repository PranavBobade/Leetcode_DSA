package com.Pranav;

public class Count_Negative_Numbers_in_a_Sorted_Matrix {
    public static void main(String[] args) {
    int[][] grid = {{4,3,2,-1},{3,2,1,-1},{1,1,-1,-2},{-1,-1,-2,-3}};
        System.out.println(countNegatives(grid));
    }
//    static int countNegatives(int[][] grid) {
//    O(n^2)
//        int n = grid.length;
//        int count = 0;
//        for (int i = 0; i < n; i++) {
//            for (int j = 0; j < grid[i].length; j++) {
//                if (grid[i][j] < 0)
//                    count++;
//            }
//        }
//        return count;

    //O(m*(log(n)))
    //t.c of 2d array by applying BS with m row and n col is m*logn

    static int countNegatives(int[][] grid) {
    int count = 0;

        for(int i = 0; i < grid.length; i++){

        int start = 0;
        int end = grid[i].length - 1;

        while(start <= end){

            int mid = start + (end - start) / 2;

            if(grid[i][mid] < 0){    // applying BS in each row
                count += end - mid + 1; //counting -ve no.s
                end = mid - 1;
            } else {
                start = mid + 1;
            }
        }

    }
        return count;


    }
}
