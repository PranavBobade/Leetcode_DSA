package com.Pranav;

public class Kth_Missing_Positive_Number {
    public static void main(String[] args) {
        int arr []= {2,3,4,7,11};
        int k = 5;
        System.out.println(findKthPositive(arr,k));
    }

    //case 1: [2,3,4,7,11], k=5
    //case 2:[1,2,3,4], k=2
    //case 3:[4,5,6,7,8] k=3
    static int findKthPositive(int[] arr, int k) {
        int start = 0;
        int end = arr.length - 1;

        while(start <= end){
            int mid = start + (end - start) / 2;


            if(arr[mid] - (mid+1) < k){
                start = mid + 1;
            } else {
                end  = mid - 1;
            }
        }

        return k + start;
    }
}
