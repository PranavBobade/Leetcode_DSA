package com.sorting;

import java.util.ArrayList;
import java.util.List;

public class Find_All_Duplicates_in_an_Array {
    public static void main(String[] args) {
        int []nums = {4,3,2,7,8,2,3,1};
        System.out.println(findDuplicates(nums));
    }
    static List<Integer> findDuplicates(int[] nums) {
        List<Integer> list = new ArrayList<>();
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
                list.add(nums[index]);
        }
        return list;
    }
    static void swap ( int a[], int first, int second)
    {
        int temp = a[first];
        a[first] = a[second];
        a[second] = temp;
    }
}
