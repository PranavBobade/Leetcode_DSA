package com.Pranav;

import java.util.ArrayList;
import java.util.Arrays;

public class Intersection_of_Two_Arrays_II {
    public static void main(String[] args) {
       int[] nums1 = {1,2,2,1};
       int []nums2 = {2,2};
        System.out.println(Arrays.toString(intersect(nums1,nums2)));
    }

    static int[] intersect(int[] nums1, int[] nums2) {
        // 2 pointer + arraylist
        ArrayList<Integer> list=new ArrayList<Integer>();
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
                list.add(nums1[i]);
                i++;                  // if matches increase both pointers
                j++;

            }
        }
        int a[]=new int[list.size()];
        int index=0;
        for (int x:list
        ) {
            a[index++]=x;
        }
        return a;
    }
}
