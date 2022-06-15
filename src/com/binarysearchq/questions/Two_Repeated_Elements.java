package com.binarysearchq.questions;

import java.util.Arrays;

public class Two_Repeated_Elements {
    public static void main(String[] args) {
        int N = 4;
       int array[] = {1,2,1,3,4,3};
        System.out.println(Arrays.toString(twoRepeated(array,N)));
    }
    static int[] twoRepeated(int arr[], int N)
    {   int[] ans = new int[2];
        int[] temp  = new int[100001]; //Auxiliary Space = O(100001)
        int count   = 0;

        for(int num:arr)
            temp[num]++;         // created array of counts of original array

        for(int num:arr){
            if(temp[num] != 2) //  make element=-1 except whose count is 2
                temp[num] = -1;//you can take any value here
        }
        for(int num:arr){
            temp[num]--;     // as the repeated elements occur again we will go on that index & decrease its value same times
            if(temp[num] == 0){
                ans[count] = num;       // the element whose count becomes 0 we will add to ans array.
                count++;
            }
        }
        return ans;
        // Your code here
    }
}
