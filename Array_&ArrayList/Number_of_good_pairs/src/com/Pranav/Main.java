package com.Pranav;

public class Main {

    public static void main(String[] args) {
	// write your code here
       int[] nums = {1,2,3,1,1,3};
        System.out.println(numIdenticalPairs(nums));
    }

   static int numIdenticalPairs(int[] nums) {
    int count=0;
       for (int i = 0; i < nums.length-1; i++) {
           for (int j = 1; j < nums.length; j++) {
               if (i < j && nums[i] == nums[j]) {

                   count++;
               }
           }
       }
       return count;
    }
}
