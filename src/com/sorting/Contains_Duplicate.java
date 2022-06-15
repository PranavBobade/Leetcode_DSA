package com.sorting;

import java.util.Arrays;

public class Contains_Duplicate {
    public static void main(String[] args) {
        int[] nums = {1,2,3,4};
        System.out.println(containsDuplicate(nums));
    }

    static boolean containsDuplicate(int[] nums) {
//        for (int i = 0; i <nums.length ; i++) {
//            for (int j = nums.length - 1; j >= 0; j--) {
//                if (nums[i] == nums[j] && i!=j)
//                    return true;
//            }
//        }
//        return false;

        Arrays.sort(nums);
        for(int i=1;i<nums.length;i++){
            if(nums[i]==nums[i-1])
                return true;
        }
        return false;
    }
}
