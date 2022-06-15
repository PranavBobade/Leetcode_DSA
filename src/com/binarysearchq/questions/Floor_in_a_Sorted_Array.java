package com.binarysearchq.questions;

public class Floor_in_a_Sorted_Array {
    public static void main(String[] args) {
      int  N = 7, x = 5;
      long  arr[] = {1,2,8,10,11,12,19};
        System.out.println(findFloor(arr,N,x));
    }
    static int findFloor(long arr[], int n, long x)
    {
        int start=0;
        int end=n-1;
            while(start<=end)
            {
              int mid=start+(end-start)/2;
              if(arr[mid]>x)
              {
                  end=mid-1;
              }
              else if(arr[mid]<x)
              {
                  start=mid+1;
              }
            }
            return end;
    }
}
