package com.sorting;

import java.util.Arrays;

public class Squares_of_a_Sorted_Array {
    public static void main(String[] args) {
      int[]  nums = {-4,-1,0,3,10};
        System.out.println(Arrays.toString(sortedSquares(nums)));
    }
    static int[] sortedSquares(int[] nums) {
//        int j=0;
//        for(int i=0;i<nums.length;i++)
//        {
//            nums[j]=nums[i]*nums[i];
//            j++;
//        }
//        Arrays.sort(nums);
//        return nums;


 //       ~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~
        int n = nums.length;

        int[] result = new int[nums.length];

        int low = 0;
        int high = nums.length-1;

        int i = 0;
        while(low <= high){
            if(nums[low] * nums[low] > nums[high] * nums[high]){
                result[n-1-i] = nums[low] * nums[low];
                low++;
            }
            else{
                result[n-1-i] = nums[high] * nums[high];
                high--;
            }
            i++;
        }

        return result;
    }
}
