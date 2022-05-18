package com.Pranav;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

public class Median_of_Two_Sorted_Arrays {
    public static void main(String[] args) {
        int[] nums1 = {1, 3};
        int[] nums2 = {2};
        System.out.println(findMedianSortedArrays(nums1, nums2));
    }

    static double findMedianSortedArrays(int[] nums1, int[] nums2) {
//        ArrayList<Integer> list=new ArrayList<Integer>();
//        double ans=0;
//
//        for(int x:nums1)
//        {
//            list.add(x);
//        }
//        for(int y:nums2)
//        {
//            list.add(y);
//        }
//        list.sort(Comparator.naturalOrder());
//        int n=list.size();
//
//        if(n%2==0)
//        {
//            ans=BS(list,0,n-1,true);
//        }
//        else
//        {
//            ans=BS(list,0,n-1,false);
//        }
//        return ans;
//    }
//
//    static double BS(ArrayList<Integer> a,int start,int end,Boolean Iseven)
//    { int mid=0;
//      double mvalue=0;
//
//
//        while(start<=end)
//        {
//            mid=start+(end-start)/2;
//            mvalue=a.get(mid);
//            if(Iseven)
//            {
//                return (double) (mvalue+a.get(mid+1))/2;
//            }
//            else
//                return mvalue;
//
//        }
//        return -1;
        ArrayList<Integer> mergedArray = new ArrayList<Integer>();

        for (int x : nums1) mergedArray.add(x);
        for (int x : nums2) mergedArray.add(x);

        Collections.sort(mergedArray); //[1,2,3,4]

        double median = 0;
        int start = 0;
        int end = mergedArray.size() - 1;

        if (mergedArray.size() % 2 == 0) {
            int mid = start + (end - start) / 2;
            median = mergedArray.get(mid) + mergedArray.get(mid + 1);
            return median / 2;
        } else {
            int mid = start + (end - start) / 2;
            median = mergedArray.get(mid);
            return median;

        }

    }
}
