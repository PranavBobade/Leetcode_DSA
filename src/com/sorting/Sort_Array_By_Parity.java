package com.sorting;

import java.util.Arrays;

public class Sort_Array_By_Parity {
    public static void main(String[] args) {
       int[] nums = {3,1,2,4};
        System.out.println(Arrays.toString(sortArrayByParity(nums)));
    }
    static int[] sortArrayByParity(int[] nums) {
//    int a[]=new int[nums.length];
//    int x=0;
//        for (int i = 0; i < nums.length; i++) {
//            if(nums[i]%2==0)
//            {
//                a[x]=nums[i];
//                x++;
//            }
//        }
//        for (int i = 0; i < nums.length; i++) {
//            if(nums[i]%2!=0)
//            {
//                a[x]=nums[i];
//                x++;
//            }
//        }
//        return a;
//        ~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~`

        int j = 0;
        for(int i = 0; i < nums.length; i ++)
            if(nums[i] % 2 == 0)
            {                                      // Swap position of nums[i] and nums[j]
                //when you got even number swap it with odd number
                int t = nums[i];
                nums[i] = nums[j];
                nums[j] = t;
                j ++;
            }
        return nums;

//        ~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~
//        int n = nums.length;
//        int[] ans = new int[n];
//
//        int j = n-1;
//        int i = 0;
//
//        for(int num:nums) {
//            if(num % 2 == 0){
//                ans[i] = num;
//                i++;
//            } else {
//                ans[j] = num;
//                j--;
//            }
//        }
//
//        return ans;
    }
}
