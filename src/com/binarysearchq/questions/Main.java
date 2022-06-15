package com.binarysearchq.questions;

public class Main {
//https://leetcode.com/problems/search-insert-position/
    //ceiling of number
    public static void main(String[] args) {
        // write your code here

        int[] nums = {1, 3, 5, 6};
        int target = 2;
        System.out.println(searchInsert(nums, target));
    }

    static int searchInsert(int[] nums, int target) {
        int start = 0;
        int end = nums.length - 1;
        int mid=0;
        while (start <= end) {
          mid = start + (end - start) / 2;

            if (target < nums[mid])
                end = mid - 1;
            else if (target > nums[mid])
                start = mid + 1;
            else
                return mid;
        }
        return start;   //when while condition violates start is the element >=target
    }
}
