package com.Pranav;

import java.util.Arrays;

public class Main {

    public static void main(String[] args) {
	// write your code here
        int n= 3,m= 3;
        long a[]={10, 5, 15};
        long b[]={20, 3, 2};
        long res[]=new long[n+m];
        sortedMerge(a,b,res,n,m);
    }

    static void sortedMerge(long A[], long B[], long res[], int N, int M) {
        // Your code goes here
        int k=0;
        for(long i : A)
        {
            res[k++]=i;
        }
        for(long j : B)
        {
            res[k++]=j;
        }
        Arrays.sort(res);
        for(long num : res)
        {
            System.out.print(num+" ");
        }
    }
}
