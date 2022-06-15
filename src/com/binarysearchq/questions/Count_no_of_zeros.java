package com.binarysearchq.questions;

public class Count_no_of_zeros {
    public static void main(String[] args) {
       int N = 12;
        int Arr[] = {1, 1, 1, 1, 1, 1, 1, 1, 0, 0, 0, 0};
        System.out.println(searchInsert(Arr,0,12));
    }
    static int searchInsert(int[] nums,int target,int N) {
        int start = 0;
        int end = N - 1;

        while(start <= end){
            int mid = start + (end - start) / 2;

            if(nums[mid] == 1) {
                start = mid + 1;
            } else {
                end=mid-1;
            }
        }

        return N-start;
    }
}
