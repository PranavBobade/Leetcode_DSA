package com.binarysearchq.questions;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;

public class Intersection_of_Two_Arrays {
    public static void main(String[] args) {
       int[] nums1 = {1,2,2,1};
       int nums2[] = {2,2};
        System.out.println(Arrays.toString(intersection(nums1,nums2)));
    }
    static int[] intersection(int[] nums1, int[] nums2) {
//hashset
//        HashSet<Integer> set=new HashSet<Integer>(); // add one array to set hashset
//        for (int i:nums1) {
//            set.add(i);
//        }
//        HashSet<Integer> Intersection=new HashSet<Integer>();
//        for (int i:nums2) {               // check if set contains 2nd array element
//            if(set.contains(i))
//            {
//                Intersection.add(i);      // if present add to Intersection set
//            }
//        }
//        int []ans=new int[Intersection.size()];  // convert hashset to array
//        int index=0;
//        for (int i:Intersection) {
//            ans[index++]=i;
//        }
//        return ans;


        // 2 pointer + hashset
        HashSet<Integer> set=new HashSet<Integer>();
        Arrays.sort(nums1);
        Arrays.sort(nums2);
        int n=nums1.length;
        int m=nums2.length;

        int i=0, j=0;
        while(i<n && j<m)// both the pointers must be in bound
        {
            if(nums1[i]>nums2[j]) j++;   // if ith element is greater increase jth index
            else if(nums1[i]<nums2[j]) i++; //if jth element is greater increase ith index
            else{
                set.add(nums1[i]);
                i++;                  // if matches increase both pointers
                j++;

            }
        }
        int a[]=new int[set.size()];
        int index=0;
        for (int x:set
        ) {
            a[index++]=x;
        }
        return a;
    }
}
