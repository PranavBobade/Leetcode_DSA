package com.sorting;

import java.util.Arrays;

public class Sort_Array_By_Parity_II {
    public static void main(String[] args) {
       int[] nums = {4,2,5,7};
        System.out.println(Arrays.toString(sortArrayByParityII(nums)));
    }
    static int[] sortArrayByParityII(int[] nums) {
        int n = nums.length;
        int[] ans = new int[n];

        int j = n-1;
        int i = 0;

        for(int num:nums) {
            if(num % 2 == 0){
                ans[i] = num;
                i+=2;    // put even at even index
            } else {
                ans[j] = num;
                j-=2;    // put odd at odd index
            }
        }
        return ans;
    }
}
