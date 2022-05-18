package com.Pranav;

public class Main {

    public static void main(String[] args) {
	// write your code here
       int []nums = {555,901,482,1776};
        System.out.println(findNumbers(nums));
      //  System.out.println(digits2(-345678));

    }
    static int findNumbers(int[] nums) {
//        int rem=0,count=0,ans=0;
//        for(int i=0;i<nums.length;i++)
//        {  count=0;
//            while(nums[i]>0)
//            {
//                rem=nums[i]%10;
//                nums[i]=nums[i]/10;
//                count++;
//            }
//            System.out.println(count);
//            if(count%2==0)
//                ans++;
//
//
//        }
//        return ans;
//------------------------------------------------------------------------------------------------------

        int totalEvenNumbers = 0;
        for (int num : nums) {
            if (Integer.toString(num).length() % 2 == 0) {
                totalEvenNumbers++;
            }
        }
        return totalEvenNumbers;

      //  -----------------------------------------------------------------------------------------------
//        int count=0;
//        for (int num:nums) {
//            if(even(num))
//                count++;
//        }
//        return count;
//    }
//    static boolean even(int num)
//    {
//        int numberOfDigits=digits(num);
//        return numberOfDigits%2==0;
//    }
//    static  int digits2(int num)
//    {
//        if(num<0)
//        {
//            num=num*-1;
//        }
//
//        return (int)(Math.log10(num))+1;
//    }
//
//    static  int digits(int num)
//    {
//        if(num<0)
//        {
//            num=num*-1;
//        }
//        if(num==0)
//        {
//            return 1;
//        }
//        int count=0;
//        while(num>0)
//        {
//            count++;
//            num=num/10;
//        }
//        return count;
    }
}
