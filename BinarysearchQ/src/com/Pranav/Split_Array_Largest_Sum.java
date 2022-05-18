package com.Pranav;


public class Split_Array_Largest_Sum {
    public static void main(String[] args) {

        int []nums = {7,2,5,10,8};
        int m = 2;
        System.out.println(splitArray(nums,m));
    }
    static int splitArray(int[] nums, int m) {
        int start=0;
        int end=0;

        for (int i = 0; i <nums.length ; i++) {
            start=Math.max(start,nums[i]); // int the end of the loop this will contain the max item from the array.
            end+=nums[i]; // sum of all values in array.
        }
        // binary search
        while(start<end)
        {
            //try for the middle as potential ans
            int mid=start+(end-start)/2;
            // calculate how many pieces you can divide this in with this max sum
            int sum=0;
            int pieces=1;

            for (int num:nums) {
                if (sum + num > mid) {
                    //you cannot add this in this subarray, make new one
                    //say you add this num in new subarray , then sum==new
                    sum = num; // reset array to new and adding new element from num to sum and counting 1 subarray is formed
                    pieces++;
                } else {
                    sum += num;
                }
            }
                if(pieces>m)   // we need pieces ==m and return  minimized largest sum among these m subarrays.
                {
                    start=mid+1;
                }
                else
                {
                    end=mid;
                }
            }


        return end; // because here start==end
    }

}
