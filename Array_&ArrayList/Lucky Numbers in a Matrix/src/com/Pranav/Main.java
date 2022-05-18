package com.Pranav;

import jdk.swing.interop.SwingInterOpUtils;

import java.util.ArrayList;
import java.util.List;

public class Main {

    public static void main(String[] args) {
	// write your code here
      int a[][] = {{1,10,4,2},{9,3,8,7},{15,16,17,12}};
        System.out.println(luckyNumbers(a));
    }
    static List<Integer> luckyNumbers (int[][] matrix) {
     List <Integer> list = new ArrayList<>();
        for (int i = 0; i <matrix.length ; i++) {
            int index=0;
            int min= 999999999;

            for (int j = 0; j <matrix[i].length ; j++) {

                if(matrix[i][j]<min) {
                    min = matrix[i][j];   //find min. element in row
                    index = j;
                }
            }
           boolean isTrue=true;

            for (int j = 0; j < matrix.length; j++) {
                if(matrix[i][index]<matrix[j][index])  // check if the min. element in the row is max. in the column
                isTrue=false;

            }
            if(isTrue==true)                 //if the min. element in the row is max. in the column then it is our required ans.
                list.add(matrix[i][index]);
        }
        return list;
    }
}
