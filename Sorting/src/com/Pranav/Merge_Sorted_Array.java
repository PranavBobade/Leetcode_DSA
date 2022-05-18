package com.Pranav;

import java.util.Arrays;

public class Merge_Sorted_Array {
    public static void main(String[] args) {
      int[]  nums1 = {0};
      int m = 0,  n = 1;
      int []nums2 = {1};
      merge(nums1,m,nums2,n);


    }
    static void merge(int[] nums1, int m, int[] nums2, int n) {
      int tails1=m-1; int tails2=n-1; int f=m+n-1;

      while(tails1>=0  && tails2>=0) {
          nums1[f--]=(nums1[tails1]>nums2[tails2])?nums1[tails1--]:nums2[tails2--];

      }
      while(tails2>=0)
          nums1[f--]=nums2[tails2--];


//        if(n == 0)
//            return;
//
//        int i = 0;
//        int j = 0;
//
//
//
//        while(i < nums1.length && j < nums2.length){
//            if(nums1[i] == 0){
//                nums1[i] = nums2[j];
//                j++;
//            }
//            i++;
//        }
//
//        Arrays.sort(nums1);
//        System.out.println(Arrays.toString(nums1));
        }
    }
