package com.Pranav;

public class Main {

    public static void main(String[] args) {
	// write your code here
    int [] nums = {1,2,3,4,5,6,7};
    int k = 3;
    rotate(nums,k);
    }

//    trick here is--
//    1. reverse whole array
//    2. reverse first k elements
//    3. reverse elements from k to end

    static void rotate(int[] nums, int k) {
          k=k%nums.length;   // to know how many elements to reverse 

          reverse(nums, 0, nums.length-1);
          reverse(nums, 0, k-1);
          reverse(nums,k,nums.length-1);
        for (int x:nums
             ) {
            System.out.println(x+" ");

        }
    }
    static void reverse(int []nums, int start, int end)
    {
       while (start<end)
       {
           int temp=nums[start];
           nums[start]=nums[end];
           nums[end]=temp;
           start++;
           end--;
       }
    }
}

