package com.binarysearchq.questions;

public class majority_element {
    public static void main(String[] args) {
       int N = 5;
       int A[] = {5,12,3,4,5,5,5};
        System.out.println(majorityElement(A,N));
    }

    static int majorityElement(int a[], int size)
    {
        int mid = size / 2;    // N/2
        int[] arr = new int[10000001]; // created array

        for(int num: a)
            arr[num]++;         // storing count for each element in new array(element is index)

        for(int i = 0; i < arr.length; i++){
            if(arr[i] > mid)           // if count of any element is greater than N/2
                return i;               // return index as (as index is actual element of old array)
        }

        return -1;
    }

    }

