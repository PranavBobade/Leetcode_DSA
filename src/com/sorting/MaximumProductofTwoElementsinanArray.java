package com.sorting;

public class MaximumProductofTwoElementsinanArray {
    public static void main(String[] args) {
       int [] nums = {3,4,5,2};
        System.out.println(maxProduct(nums));
    }
    static int maxProduct(int[] nums) {
        int max1 = Integer.MIN_VALUE;
        int max2 = Integer.MIN_VALUE;

        for(int i = 0; i < nums.length; i++)
        {
            if(nums[i] > max1)
            {   max2 = max1;
                max1 = nums[i];
            }

            else if(nums[i] > max2)
                max2 = nums[i];
        }
        return (max1 - 1) * (max2 - 1);
    }
}
