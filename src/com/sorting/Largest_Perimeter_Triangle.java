package com.sorting;

import java.util.Arrays;

public class Largest_Perimeter_Triangle {
    public static void main(String[] args) {
        int [] nums = {2,1,2};
        System.out.println(largestPerimeter(nums));
    }
    static int largestPerimeter(int[] nums) {
        Arrays.sort(nums);
        int n=nums.length;

        for(int i=n-3;i>=0;i--)
        {  //check last 3 max lengths
            int s=nums[i]+nums[i+1];
            if(s>nums[i+2])  // check if triangle forms with non-zero-area
                return nums[i]+nums[i+1]+nums[i+2];
        }

        return 0;
    }
}
