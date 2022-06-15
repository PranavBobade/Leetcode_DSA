package com.interview;

public class P {
    public static void main(String[] args) {
     //   int nums[] = {2,2,1,1,1,2,2,1,2,1};
        int nums [] = {0,0,1,1,1,2,2,3,3,4};

        System.out.println(fun(nums));
    }
    static  int  fun(int []nums)
    {
//        int count =0;
//        int fcount = nums.length/2;
//        for (int num : nums)
//        {
//            for(int elem : nums)
//            {
//                if(elem == num)
//                    count++;
//            }
//            if(count > fcount)
//                return num;
//        }
//        return -1;

        if(nums.length == 0)
            return 0;
        int i =0;
        for (int j = 1; j < nums.length ; j++) {
            if(nums[j]!=nums[i])
            {
                i++;
            nums[i] =nums[j];

        }
    }
    return i+1;
}
}