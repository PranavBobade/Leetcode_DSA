package com.Pranav;

import java.util.Arrays;

public class Main {

    public static void main(String[] args) {
	// write your code here
       int [][] matrix = {{1,2,3},{4,5,6},{7,8,9}};
        for (int x[]:transpose(matrix)) {
            System.out.println(Arrays.toString(x));
        }
    }

    static int[][] transpose(int[][] matrix)
    {
//if(matrix.length==matrix[0].length) {
//    for (int i = 0; i < matrix.length; i++) {
//        for (int j = 0; j <= i; j++) //j<=i because  we have to replace only lower triangle values with upper leaving diagonal elements unchanged
//        {
//            int temp = matrix[i][j];
//            matrix[i][j] = matrix[j][i];
//            matrix[j][i] = temp;
//
//        }
//    }
//    return matrix;
//}
//else {
//    int[][] res = new int[matrix[0].length][matrix.length];  // if row!=column then size of matrix changes so defined new matrix with modified size.
//    for (int i = 0; i < matrix.length; i++) {
//        for (int j = 0; j < matrix[0].length; j++) {
//            res[j][i] = matrix[i][j];
//        }
//    }
//    return res;
//}

        // 2nd soln

        int m=matrix.length;
        int n=matrix[0].length;
        int ans[][]=new int[n][m];

        for(int i=0;i<n;i++)
        {
            for(int j=0;j<m;j++)
            {
                ans[i][j]=matrix[j][i];
            }
        }
        return ans;
    }
}
