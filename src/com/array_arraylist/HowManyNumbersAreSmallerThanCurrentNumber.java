package com.array_arraylist;

import java.util.Arrays;

public class HowManyNumbersAreSmallerThanCurrentNumber {

    public static void main(String[] args) {
	// write your code here
       int nums[] = {6,5,4,8};
        System.out.println(Arrays.toString(smallerNumbersThanCurrent(nums)));
    }

    static int[] smallerNumbersThanCurrent(int[] nums) {
   int count=0;
   int x=0;
   int ans[]=new int[nums.length];
        for (int i = 0; i < nums.length; i++) {
            count=0;
            for (int j = 0; j < nums.length; j++) {
                if(j!=i && nums[j]<nums[i] )
                    count++;
            }
            ans[x]=count;
            x++;

            
        }
        return ans;
    }
}
