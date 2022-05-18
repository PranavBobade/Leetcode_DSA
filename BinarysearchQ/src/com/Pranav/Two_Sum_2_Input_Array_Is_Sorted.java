package com.Pranav;

import java.util.Arrays;

public class Two_Sum_2_Input_Array_Is_Sorted {
    public static void main(String[] args) {
       int[] numbers = {2,7,11,15};
       int target = 11;
        System.out.println(Arrays.toString(twoSum(numbers,target)));
    }
    static int[] twoSum(int[] numbers, int target) {


//        int low=0,high=numbers.length-1;
//        while(low<=high){
//            if(numbers[low]+numbers[high]==target)
//                break;
//            else if(numbers[low]+numbers[high]<target)
//                low++;
//            else if(numbers[low]+numbers[high]>target)
//                high--;
//        }
//        return new int[]{low+1,high+1};// since 1 indexed array.
        int start=0;
        int end=numbers.length-1;
        while(start<=end)
        {
            int mid=start+(end-start)/2;
            if(numbers[start]+numbers[end]==target)
                return new int[]{start+1,end+1};
            else if(numbers[start]+numbers[end]>target)
                end=mid-1;
            else if (numbers[start]+numbers[end]<target)
                start=mid+1;
        }
        return new int[]{end+1,start+1};


        // not complete solution
    }
}
