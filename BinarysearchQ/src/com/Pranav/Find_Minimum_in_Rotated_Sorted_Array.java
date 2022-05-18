package com.Pranav;

public class Find_Minimum_in_Rotated_Sorted_Array {
    public static void main(String[] args) {
        int []nums = {3,4,5,1,2};
        System.out.println(findMin(nums));
    }
    static int findMin(int[] nums) {
        if(nums.length==0) return -1;
        if(nums.length==1) return nums[0];

        int start = 0;
        int end = nums.length - 1;

        while (start < end) {
            int mid = start + (end - start) / 2;

            if (mid > 0 && nums[mid] < nums[mid - 1]) {
                return nums[mid];
            }
            else if (nums[start] <= nums[mid] && nums[mid]>nums[end]) {// array is sorted from start-mid & mid+1-end
                start = mid + 1;
            } else {
                end=mid-1;
            }
        }
        return nums[start];
    }
}
