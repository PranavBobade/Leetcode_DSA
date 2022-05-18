package com.Pranav;

public class count_no_of_ones {
    public static void main(String[] args) {
       int N = 8;
      int  arr[] = {1,1,1,1,1,0,0,0};
        System.out.println(searchInsert(arr,1,8));
    }
    static int searchInsert(int[] nums,int target,int N) {
        int start = 0;
        int end = N - 1;

        while(start <= end){
            int mid = start + (end - start) / 2;

            if(nums[mid] == 0) {
                end = mid - 1;
            } else {
                start = mid + 1;
            }
        }

        return end + 1;
    }

}
