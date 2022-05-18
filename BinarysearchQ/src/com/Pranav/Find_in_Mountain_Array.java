package com.Pranav;
//https://leetcode.com/problems/find-in-mountain-array/

//find peak element
//apply binary search in asc array
// if target not found apply bs in des. array
public class Find_in_Mountain_Array {

    public static void main(String[] args) {
      int []  array = {1,2,3,4,5,3,1};
      int target = 3;
      System.out.println(findInMountainArray(target,array));

    }

    static int findInMountainArray(int target, int[] array) {
   int peak =peakIndexInMountainArray(array);
   int firstTry=orderAgnosticBS(array, target, 0,peak);
           if(firstTry!=-1)
           {
               return firstTry;
           }
           // try to search in second half
        return orderAgnosticBS(array, target, peak+1,array.length-1);
    }

    static int peakIndexInMountainArray(int[] arr) {
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

    static  int orderAgnosticBS(int []a,int target ,int start, int end)
    {

        // find whether the array is sorted in ascending or descending order
        boolean isAsc=a[start]<a[end];

        while (start <= end) {

            // find the middle element
            //     int mid=(start+end)/2;   // might be possible that (start+end) exceeds the range of integer in java
            int mid = start + (end - start) / 2;

            if(a[mid]==target) {
                return mid;
            }
            if(isAsc) {
                if (target < a[mid]) {
                    end = mid - 1;

                } else {
                    start = mid + 1;
                }
            }
            else
            {
                if (target > a[mid]) {
                    end = mid - 1;
                }
                else {
                    start = mid + 1;
                }
            }
        }
        return -1;
    }
}
