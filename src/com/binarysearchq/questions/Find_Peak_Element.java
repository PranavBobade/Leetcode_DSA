package com.binarysearchq.questions;
//https://leetcode.com/problems/find-peak-element/
public class Find_Peak_Element {
    public static void main(String[] args) {
        int[] nums = {1, 2, 1, 3, 5, 6, 4};
        System.out.println(findPeakElement(nums));
    }

    static int findPeakElement(int[] nums) {
        int start = 0;
        int end = nums.length - 1;

        while (start < end) { // in the end start and end will point to larger element hence start==end will loop break condition
            int mid = start + (end - start) / 2;

            if (nums[mid] > nums[mid + 1]) {
                // you are in dec. part of array
                // this may be the ans, but look at left
                //this is why end!=mid-1
                end = mid; // here we don't know if there is element greater than mid hence end=mid
            } else {
                //you are in asc. part of array
                // because we know that mid+1 element>mid element
                start = mid + 1; // here we know that there is element greater than mid hence start=mid+1
            }
        }
        // in the end, start==end and pointing to the largest number because of the 2 checks above
        // start and end are always trying to find max element in the above 2 checks
        // hence when they are pointing to just one element, that is the maximum one because that is what the checks say
        // more elaboration: at every point of time for start and end, they have the best possible answer till that time
        // and if we are saying that only  one item is remaining hence because of above line that is the best possible answer
        return start; // or return end as both are equal
    }
}