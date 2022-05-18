package com.Pranav;
//https://leetcode.com/problems/find-the-duplicate-number/
//Amazon
public class Find_the_Duplicate_Number {
    public static void main(String[] args) {
        int[] nums = {1, 3, 4, 2, 2};
        System.out.println(findDuplicate(nums));
    }

    static int findDuplicate(int[] nums) {
        int i = 0;
        while (i < nums.length) {
            if (nums[i] != i + 1) {
                int correct = nums[i] - 1; ////for sorted // index=element-1;
                if (nums[i] != nums[correct]) { //for duplicate element only this condition fails
                    swap(nums, i, correct);
                } else {

                    return nums[i];
                }
            } else {
                i++;
            }
        }
     return -1;
    }
    static void swap ( int a[], int first, int second)
    {
        int temp = a[first];
        a[first] = a[second];
        a[second] = temp;
    }
}
