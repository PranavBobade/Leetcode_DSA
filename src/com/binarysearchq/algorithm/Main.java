package com.binarysearchq.algorithm;

public class Main {

    public static void main(String[] args) {
        // write your code here
        int a[]={-18,-12,-4,0,2,4,6,9,11,12,14,20,36,48};
        int target=-467;
        System.out.println(BinarySearch(a,target));

    }
    //return the index
    //return -1 if it does not exist
    static int BinarySearch(int a[], int target) {
        int start = 0;
        int end = a.length - 1;
        while (start <= end) {

            // find the middle element
            //     int mid=(start+end)/2;   // might be possible that (start+end) exceeds the range of integer in java
            int mid = start + (end - start) / 2;

            if (target < a[mid]) {
                end = mid - 1;

            } else if (target > a[mid]) {
                start = mid + 1;
            } else {// ans found
                return mid;
            }


        }
        return -1;

    }
}
