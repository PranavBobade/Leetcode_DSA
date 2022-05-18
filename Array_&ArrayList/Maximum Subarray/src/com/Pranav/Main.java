package com.Pranav;

public class Main {

    public static void main(String[] args) {
	// write your code here
       int [] nums = {-2,1,-3,4,-1,2,1,-5,4};
        System.out.println(maxSubArray(nums));
    }
    static int maxSubArray(int[] nums) {
        // kadane's algorithm O(n)
        int sum=0;
        int max=nums[0];
        for(int i=0;i<nums.length;i++)
        {
            sum+=nums[i];
            if(sum>max)       // if sum is greater than max then only update
                max=sum;
            if(sum<0)   //if sum goes below 0 then we update it to zero because carrying negative sum is not useful
                sum=0;
        }
        return max;
        //----------------------------------------------------------------------------------
//        O(N^2)
//        int max=0;
//        for (int i = 0; i < nums.length; i++) {
//            sum=0;
//            for (int j = i; j <nums.length ; j++) {
//                sum += nums[j];
//                if (sum > max)
//                    max = sum;
//            }
//        }
//
//     return max;
   //     ----------------------------------------------------------------------------------
        //O(n^3)

//        int max=0;
//        for (int i = 0; i < nums.length; i++) {
//
//            for (int j = i; j <nums.length ; j++) {
//                sum=0;
//                for (int k = i; k <j ; k++) {
//                    sum+=nums[k];
//                    if (sum > max)
//                        max = sum;
//                }
//
//            }
//        }
//        return max;
    }
}
