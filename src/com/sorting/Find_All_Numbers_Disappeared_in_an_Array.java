package com.sorting;
//https://leetcode.com/problems/find-all-numbers-disappeared-in-an-array/
// asked in google
import java.util.ArrayList;
import java.util.List;

public class Find_All_Numbers_Disappeared_in_an_Array {
    public static void main(String[] args) {
       int[] nums = {1,1};
        System.out.println(findDisappearedNumbers(nums));
    }
    static List<Integer> findDisappearedNumbers(int[] nums) {
        List<Integer> list = new ArrayList<>();
        int i = 0;
        while (i < nums.length ) {
            int correct = nums[i] - 1; ////for sorted // index=element-1;
            if (nums[i] != nums[correct]) {
                swap(nums, i, correct);
            } else {
                i++;
            }
        }
        // just find missing numbers
        for (int index = 0; index < nums.length; index++) {
            if (nums[index] != index+1)    //since value=index+1
                list.add(index+1);
        }
        return list;
    }
    static void swap(int a[],int first,int second)
    {
        int temp=a[first];
        a[first]=a[second];
        a[second]=temp;
    }
}
