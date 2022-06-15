package com.sorting;

import java.util.Arrays;

public class Set_Mismatch {
    public static void main(String[] args) {
       int[] nums = {1,2,2,1};
        System.out.println(Arrays.toString(findErrorNums(nums)));
    }
    static int[] findErrorNums(int[] nums) {
        int i = 0;
        while (i < nums.length) {

            int correct = nums[i] - 1; ////for sorted // index=element-1;
            if (nums[i] != nums[correct]) { //for duplicate element only this condition fails
                swap(nums, i, correct);
            } else {
                i++;
            }
        }
        for (int index = 0; index <nums.length ; index++) {
            if(nums[index]!=index+1)
                return new int[]{nums[index],index+1};
            //nums[index]-duplicate element
            //index+1 - missing element


        }
        return new  int[]{-1,-1};
    }
   static void swap ( int a[], int first, int second)
    {
        int temp = a[first];
        a[first] = a[second];
        a[second] = temp;
    }
}

