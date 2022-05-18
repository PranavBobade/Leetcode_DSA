package com.Pranav;

public class leaf_index {
    public static void main(String[] args) {
       int N = 10;
       int arr[] = {0,1,2,2,3,4,5,5,6,7};
        int x = 1;
        System.out.println(leftIndex(N,arr,x));
    }
 static int leftIndex(int N, int arr[], int X){
        int start=0;
        int end=N-1;
     boolean isPresent = false;
        while(start<=end)
        {  int mid=start+(end-start)/2;
            if(arr[mid]==X)
            {
                end=mid-1;
                isPresent=true;
            }
            else if(arr[mid]>X) {
                end=mid-1;
            }
            else {
                start=mid+1;
            }

        }
        // Your code here
     if(isPresent)
         return end+1;
   return -1;
    }
}
