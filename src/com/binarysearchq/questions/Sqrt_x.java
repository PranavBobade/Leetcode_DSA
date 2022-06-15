package com.binarysearchq.questions;

public class Sqrt_x {
    public static void main(String[] args) {
        int x = 11111123;
        System.out.println(mySqrt(x));
    }

    static int mySqrt(int x) {
        int start = 0;
        int end = x/2;

        if(x <= 1)
            return x;

        while(start<=end) {
            int mid = start + (end - start) / 2;
            long m=(long)mid*(long)mid;
            if (m== x)
                return mid;
            else if (m > x)
                end = mid - 1;
            else
            {
                start=mid+1;
            }

        }
        return end;
    }

}



