package com.binarysearchq.questions;

import java.util.ArrayList;
import java.util.List;

public class Count_of_Smaller_Numbers_After_Self {
    public static void main(String[] args) {
       int[] nums = {5,2,6,1};
        System.out.println(countSmaller(nums));
    }
    static List<Integer> countSmaller(int[] nums) {
       // O(n^2)
     //   TLE~~~~~~~~~~~~~~~~~~~~~~~~~~~~
        ArrayList<Integer> list=new <Integer>ArrayList();
        int count=0;

        for(int i=0;i<nums.length;i++)
        {    count=0;
            for(int j=i+1;j<nums.length;j++)
            {
                if(nums[i]>nums[j])
                {
                    count++;
                }

            }
            list.add(count);
        }
   return list;
    }
}
