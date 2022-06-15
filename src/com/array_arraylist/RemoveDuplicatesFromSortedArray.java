package com.array_arraylist;

public class RemoveDuplicatesFromSortedArray {

    public static void main(String[] args) {
	// write your code here
       int[] nums = {1,1,2};
        System.out.println(removeDuplicates(nums));
    }
    static int removeDuplicates(int[] nums) {

        // 2-pointer approach
        int n=nums.length;
        int i=0;              // i is pointing to 1st index
            for (int j = 1; j <n; j++) {
                //we are checking for unique element, when we find we are updating i and new element to nums[i]
                if (nums[j] != nums[i])
                    i++;
                nums[i] = nums[j];
            }

        return i+1;      // we are getting unique elements at initial places so length of unique array is index+1
    }
}
