package com.binarysearchq.questions;

import java.util.Arrays;

public class count_only_repeated {
    public static void main(String[] args) {
        int n= 5;
       int arr[] = {1,2,3,3,4};


        System.out.println(Arrays.toString(findRepeating(arr,n)));
    }
     static int [] findRepeating(int arr[],int n)
    {
        //Your code here
        int[] temp = new int[10000001];
        int[] ans = new int[2];
        int count = 0;
//        Point p = new Point();
//        p.x =   -1;
//        p.y =   -1;

        for(int num: arr)
            temp[num]++;

        for(int num:arr){
            if(temp[num] > 1){
                return new int[]{num,temp[num]};//here num is element in original array
                // and temp[num] is count of that element.
            }
        }

        return new int[]{-1,-1};
    }
}
