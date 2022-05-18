package com.Pranav;
//https://leetcode.com/problems/peak-index-in-a-mountain-array/

public class Peak_Index_in_a_Mountain_Array {
    //bitonic array
    public static void main(String[] args) {
       int[] arr = {0,1,4,7,8,9,5,3,2,1,0};
        System.out.println(peakIndexInMountainArray(arr));
    }
    static int peakIndexInMountainArray(int[] arr) {
        //O(n) approach
//        int max=arr[0];
//        int index=0;
//        for(int i=1;i<arr.length;i++)
//        {
//            if(arr[i]>max)
//            {
//                max=arr[i];
//                index=i;
//            }
//
//        }
//        return index;

        //O(log(n)) approach
        int start=0;
        int end=arr.length-1;

            while (start<end) { // in the end start and end will point to larger element hence start==end will loop break condition
              int mid = start + (end - start) / 2;

                if (arr[mid]>arr[mid+1]) {
                    // you are in dec. part of array
                    // this may be the ans, but look at left
                    //this is why end!=mid-1
                    end = mid; // here we don't know if there is element greater than mid hence end=mid
                }
                else
                {
                    //you are in asc. part of array
                    // because we know that mid+1 element>mid element
                    start = mid+1; // here we know that there is element greater than mid hence start=mid+1
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
