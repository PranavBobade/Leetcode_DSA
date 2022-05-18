package com.Pranav;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class Maximum_Product_of_Three_Numbers {
    public static void main(String[] args) {
            int [] nums={-1,-2,-3,-4};
        System.out.println(maximumProduct(nums));
    }
    static int maximumProduct(int[] nums) {
//        ArrayList<Integer> list=new ArrayList<>();
//        for(int i=0;i<nums.length;i++)
//        {
//            int value = Math.abs(nums[i]);
//            list.add(value);
//        }
//        Collections.sort(list);
//        int product=1;
//        for(int i=nums.length-1;i>=nums.length-3;i--)
//        {
//            product*= list.get(i);
//        }
//        return product;


//        Arrays.sort(nums);
//        int  N = nums.length;
//
//        //product(largest +ve numbers) i.e last 3 numbers
//        int prod1 = nums[N-1] * nums[N-2] * nums[N-3];
//
//        //produc  t(in case of negative numbers)
//        //2 largest -ve no. with largest +ve no.
//        int prod2 = nums[0] * nums[1] * nums[N-1];
//
//        int maxProd = Math.max(prod1,prod2);
//
//        return  maxProd;



        int fmax = Integer.MIN_VALUE;
        int smax = Integer.MIN_VALUE;
        int tmax = Integer.MIN_VALUE;
        int fmin = Integer.MAX_VALUE;
        int smin = Integer.MAX_VALUE;

        for(int val : nums){
            //updation of max
            if(val > fmax){
                tmax = smax;
                smax = fmax;
                fmax = val;
            } else if(val > smax){
                tmax = smax;
                smax = val;
            } else if(val > tmax){
                tmax = val;
            }

            //updation of min
            if(val < fmin){
                smin = fmin;
                fmin = val;
            } else if(val < smin){
                smin = val;
            }
        }
        int p1 = fmax * smax * tmax;
        int p2 = fmax * fmin * smin;
        return Math.max(p1, p2);
    }
}
