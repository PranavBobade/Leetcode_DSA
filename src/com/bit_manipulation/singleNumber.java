package com.bit_manipulation;

public class singleNumber {
    public static void main(String[] args) {
       int [] nums = {2,2,1};
        System.out.println(singleNumber(nums));
    }
    static int singleNumber(int[] nums) {
        int x=0;
        for(int n:nums)
        {
            x^=n;
        }
        return x;
    }
}
