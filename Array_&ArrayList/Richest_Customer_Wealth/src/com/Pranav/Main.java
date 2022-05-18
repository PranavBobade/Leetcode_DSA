package com.Pranav;

import java.util.Arrays;

public class Main {

    public static void main(String[] args) {
	// write your code here
        int[][] accounts ={{1,5},{7,3},{3,5}};
        System.out.println(maximumWealth(accounts));
    }

    static int maximumWealth(int[][] accounts) {
          int max=0;
        for (int i = 0; i <accounts.length ; i++) {
            //when you start new col i.e. new person, take a new sum for that row
        int sum=0;
            for (int j = 0; j <accounts[i].length ; j++) {
                sum=sum+accounts[i][j];

                //sum=0;
            }
            if(sum>=max)
                max=sum;
        }


       return max;
    }
}
