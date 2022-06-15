package com.array_arraylist;

public class MatrixDiagonalSum {

    public static void main(String[] args) {
	// write your code here
        int a[][]={{1,2,3}, {4,5,6}, {7,8,9}};

        System.out.println(diagonalSum(a));
    }
    static int diagonalSum(int[][] mat) {
        int sum=0;
        for(int i=0;i<mat.length;i++){
            sum+=mat[i][i];
            if(i+i!=i+(mat.length-i-1)){
                sum+=mat[i][mat.length-i-1];
            }
        }
        return sum;
    }
    
}
