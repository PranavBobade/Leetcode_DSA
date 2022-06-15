package com.bit_manipulation;

import java.util.Arrays;


/*
        Approach :-
        eg. A= {1,2,3,1,2,4}
        after doing xor of all array elements we will get ans as 3^4
        lets see what it looks like in binary
        3 = 011
        4 = 100
        --------
    ans =   111
        ** If you know peoperty of xor 0^1 = 1, 1^0 = 1 but 1^1 = 0, 0^0 = 1
        Observation:- In the answerxor where-ever the bit is set that means
                      any one of single no has bit at that position set and in
                      other single no the bit at that position is unset.
        **  Now the point is can we use this?
        **  Yes ofcourse, if we segregate array elements in two groups based on answerxors
        any of the set bit position this will make sure two single no will fall in
        different groups.
        **  After segragating into two groups if we take xor of all elements in the both
        groups all the repeating elements will get cancelled out and we will gat the
        answer1 from group1 and answer2 from group2.
        */



public class singleNumber3 {
    public static void main(String[] args) {
        int a[]={1,2,3,1,2,4};
        System.out.println(Arrays.toString(findNumbers(a)));
    }
//O(n)
     static int[] findNumbers(int []nums) {
        int xor=0;
         for (int i = 0; i < nums.length ; i++) {
            xor ^= nums[i];  //Taking xor of all elements in the array
         }
         //Finding position of set bit in answer-xor
         int posOfSetBit = findSetBitPosition(xor);
         //Two variables for two groups.
         int ans1 = 0, ans2 = 0;
         for (int i = 0; i <nums.length ; i++) {
             //Check if current element's posOfSetBit is set if Yes
             //add it to first group and take xor.

             if(checkBit(nums[i],posOfSetBit))
             {
                 ans1 = ans1 ^ nums[i];
                 //else add it to second group and take xor.

             }
             else
             {
                 ans2 = ans2 ^ nums[i];
             }
         }
         //finally add answers to ans array and return after sorting.
         int[] ans = {ans1, ans2};
         //Arrays.sort(ans);
         return ans;

         //TC = O(Log(intMax) + N) || SC = O(1)

    }

     static int findSetBitPosition(int xor) {
        int pos=0;
        while(pos<32)
        {
            if(checkBit(xor,pos))
            {
                return pos;
            }
            else
            {
                pos++;
            }
        }
        return pos;
    }

    private static boolean checkBit(int xor, int pos) {
        return (xor & (1 << pos)) > 0 ? true : false;
    }


    //~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~`

  // O(nlogn)
//    Arrays.sort(nums);  //T.C - O(Nlog(N)) - so try with another solution
//    //with T.C - O(N) - use bit manipulation
//    int[] arr = new int[2];
//    int i = 0;
//    int j = 1;
//    int count = 0;
//
//        while(count < 2 && i < nums.length)
//    {
//        if(i == nums.length - 1)
//        {
//            arr[count] = nums[i];
//            count++;
//            i++;
//        }
//
//        if(j < nums.length && nums[i] != nums[j])
//        {
//            arr[count]=nums[i];
//            count++;
//            i = j;
//            j++;
//        }
//        else
//        {
//            i += 2;
//            j += 2;
//        }
//    }
//        return arr;

}
