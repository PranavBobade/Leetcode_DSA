package com.Pranav;

import java.util.*;

public class Third_Maximum_Number {
    public static void main(String[] args) {
        int[] nums = {2,2,3,1};
        System.out.println(thirdMax(nums));
    }

    static int thirdMax(int[] nums) {
//        Set<Integer> set = new HashSet<>(); // to remove the duplicates
//        for(int i : nums){
//            set.add(i);
//        }
//        List<Integer> list = new ArrayList<>(set); //as we need to sort the set
//        Collections.sort(list);
//
//        if(list.size() == 2){
//            return Math.max(list.get(0),list.get(1));
//        }
//        if(list.size() == 1){
//            return list.get(0);
//        }
//
//        return list.get(list.size()-3); // we need to return the third maximum element. So, subtract 3 from it.

        long firstMax = Long.MIN_VALUE;
        long secondMax= Long.MIN_VALUE;
        long thirdMax = Long.MIN_VALUE;

        for(int i = 0; i<nums.length; i++){
            if(nums[i]>firstMax){
                thirdMax = secondMax;
                secondMax = firstMax;
                firstMax = nums[i];
            }
            else if(nums[i]>secondMax && nums[i]<firstMax){ // if element is greater than second-max and less than first-max then only we are assign it to second-max
                // avoiding duplicates
                thirdMax = secondMax;
                secondMax = nums[i];
            }
            else if(nums[i]>thirdMax && nums[i]<secondMax) thirdMax = nums[i];
            // if element is greater than third-max and less than second-max then only we are assign it to third-max
            // avoiding duplicates
        }

        if(thirdMax == Long.MIN_VALUE) return (int)firstMax;

        return (int)thirdMax;
    }
}