package com.array_arraylist;

public class CellsWithOddValuesInMatrix {

    public static void main(String[] args) {
	// write your code here
       int m = 2, n = 3;
       int [][]indices = {{0,1},{1,1}};
       oddCells(m,n,indices);

    }

    static int oddCells(int m,int n, int[][] indices) {
        int ans[][]=new int[m][n];
        for (int i = 0; i < indices.length; i++) {
            //column is constant we are incrementing row elements
            for (int j = 0; j < n; j++) {
                ans[indices[i][0]][j]++;

            }
            //row is constant we are incrementing column elements

            for (int j = 0; j < m; j++) {
                ans[j][indices[i][1]]++;

            }


        }
        int count=0;
        for (int i = 0; i <m ; i++) {
            for (int j = 0; j < n; j++) {
                if(ans[i][j]%2!=0)
                    count++;
            }
        }
        return count;
    }
}
