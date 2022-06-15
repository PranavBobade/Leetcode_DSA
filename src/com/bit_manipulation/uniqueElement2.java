package com.bit_manipulation;

public class uniqueElement2 {
    // here, +ve and -ve element are given except one
    public static void main(String[] args) {
        int a[]={-2,3,2,4,-5,5,-4};
        System.out.println(findUnique(a));
    }

     static int findUnique(int[] a) {
        int ans=0;
        for(int n:a)
        {
            ans+=n;
        }
        return ans;
    }
}
