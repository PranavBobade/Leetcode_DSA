package com.Pranav;

import java.util.Arrays;

public class Main {

    public static void main(String[] args) {
	// write your code here
        int nums []= {1,2,3,4};
        System.out.println(Arrays.toString(runningSum(nums)));

    }

    static int[] runningSum(int[] nums) {
        int runningSum[]=new int[nums.length];
        runningSum[0]=nums[0];
        int sum=nums[0];

        for(int i=1;i<nums.length;i++)
        {    sum=sum+nums[i];
            runningSum[i]=sum;
        }
        return runningSum;

    }
}
