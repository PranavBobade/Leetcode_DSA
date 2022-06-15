package com.array_arraylist;

import java.util.Arrays;

public class ShuffleTheArray {

    public static void main(String[] args) {
        // write your code here
        int nums[] = {2, 5, 1, 3, 4, 7};
        System.out.println(Arrays.toString(shuffle(nums, 3))); // n=3 as in question they take n as half of array length
    }

    static int[] shuffle(int[] nums, int n) {
    int[] ans=new int[2*n];
        int x=0;                  // to manage index of ans array
        for(int i=0;i<n;i++){
            ans[x]=nums[i];
            ans[x+1]=nums[n+i];
            x+=2;                // to jump to required index
        }
        return ans;
    }

//        int[] ans = new int[2*n];
//        int j = 0;
//        for (int i = 0; i < nums.length; i += 2) {
//            ans[i] = nums[j];
//            j++;
//        }
//       // System.out.println(j);
//        for (int i = 1; i < nums.length; i += 2) {
//            ans[i] = nums[j];
//            j++;
//        }
//        return ans;
    }
