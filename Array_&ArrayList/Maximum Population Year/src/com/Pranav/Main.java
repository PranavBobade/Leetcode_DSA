package com.Pranav;

public class Main {

    public static void main(String[] args) {
	// write your code here
    int [][] logs ={{1993,1999},{2000,2010}};
        System.out.println(maximumPopulation(logs));
    }

    static int maximumPopulation(int[][] logs) {
    int a[]=new int [101];
        for (int i = 0; i < logs.length ; i++) {
            for (int j = logs[i][0]; j <logs[i][1] ; j++) {     // to traverse from birth year to death year
                a[j-1950]++;   // store population from oth position of a[] i.e a[0]=1.......
            }
        }
        int maxVal=0;
        int maxYear=1950;
        for (int i = 0; i < 101; i++) {
            if(a[i]>maxVal)
            {
                maxVal=a[i];
                maxYear=i+1950;
            }
        }
        return maxYear;
    }
}
