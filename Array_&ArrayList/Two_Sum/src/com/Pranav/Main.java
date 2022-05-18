package com.Pranav;

import java.util.Arrays;

public class Main {

    public static void main(String[] args) {
	// write your code here
      int []  nums = {2,5,5,11};
      int target = 10;
        System.out.println(Arrays.toString(twoSum(nums,target)));
    }

    static int[] twoSum(int[] nums, int target) {
       int a[]=new int[2];
        for (int i = 0; i < nums.length-1; i++) {
            for (int j = i+1; j < nums.length; j++) {
                if(nums[i]+nums[j]==target)
                {
                    a[0]=i;
                    a[1]=j;
                }

            }
        }
 return a;
    }
}
