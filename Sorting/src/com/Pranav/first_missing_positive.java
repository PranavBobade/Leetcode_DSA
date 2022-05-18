package com.Pranav;

public class first_missing_positive {
    public static void main(String[] args) {
       int[] nums = {7,8,9,11,12};
        System.out.println(firstMissingPositive(nums));
    }
    static int firstMissingPositive(int[] nums) {
        int i=0;
        while(i<nums.length)
        {
            int correct=nums[i]-1;  //for sorted // index=element;
            if(nums[i]>0 && nums[i]<=nums.length && nums[i]!=nums[correct])  //check if current index = correct index  // if not swap
            {
                swap(nums,i,correct);
            }
            else
            {
                i++;
            }


        }
        // search for first missing number
        for (int index = 0; index <nums.length ; index++) {
            if (nums[index] != index+1)
                return index+1;
        }
        //case 2
        return nums.length+1; // if all elements sorted from 1-n return n+1
    }

    static void swap(int a[],int first,int second)
    {
        int temp=a[first];
        a[first]=a[second];
        a[second]=temp;
    }
}
