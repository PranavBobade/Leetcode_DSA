package com.Pranav;

import java.util.Arrays;

public class Array_Partition_I {
    public static void main(String[] args) {
      int [] nums = {1,4,3,2};
        System.out.println(arrayPairSum(nums));
    }
    static int arrayPairSum(int[] nums) {
        Arrays.sort(nums);
        int ans=0;
        for(int i=1;i<nums.length;i+=2)
        {
           // ans=ans+Math.min(nums[i],nums[i-1]);
            ans += nums[i-1];
            //both statement works
        }
        return ans;
    }
}
