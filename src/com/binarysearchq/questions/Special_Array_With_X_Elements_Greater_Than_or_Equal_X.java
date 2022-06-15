package com.binarysearchq.questions;

public class Special_Array_With_X_Elements_Greater_Than_or_Equal_X {
    public static void main(String[] args) {
       int [] nums = {0,4,3,0,4};
        System.out.println(specialArray(nums));
    }
    static int specialArray(int[] nums) {

//        for(int i=1;i<1001;i++)
//        {  int count=0;
//            for(int num:nums)
//            {
//                if(num>=i)
//                    count++;
//            }
//            if(i==count)  //if i >= elements present in array return i
//                return i;
//        }

        int a[]=new int[1001];
        for (int num:nums) {
            a[num]++;
        }
        int total=nums.length;
        for (int i = 1; i <1001; i++) {
           if(i==total)
               return i;
           total-=a[i];
        }
        return -1;
    }
}
