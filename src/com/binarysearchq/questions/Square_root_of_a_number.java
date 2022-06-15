package com.binarysearchq.questions;

public class Square_root_of_a_number {
    public static void main(String[] args) {
        int x=26;
        System.out.println(floorSqrt(x));
    }
  static  long floorSqrt(long x)
    {    long start=0;
        // Your code here
        long end=x/2;
        if(x <= 1)
            return x;

        while(start<=end) {
            long mid=start+(end-start)/2;
            long m=(long)mid*(long)mid;
            if (m==x) {
                return mid;
            }
            else if(m> x)
            {
                end=mid-1;
            }
            else
            {
                start=mid+1;
            }
        }
        return end;
    }
}
