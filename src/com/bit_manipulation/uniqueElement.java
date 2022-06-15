package com.bit_manipulation;

// here ,every element appears twice except 1
public class uniqueElement {
    public static void main(String[] args) {
        int a[]={2,3,4,1,2,1,3,6,4};
        System.out.println(unique(a));
    }

     static int unique(int[] nums) {
        //O(n)
     int x=0;
         for (int n:nums)
         {
             x^=n;
         }
         return x;

         //~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~
         //O(n*logn+n)=nlogn
//         int x=0;
//         Arrays.sort(a);
//         for (int i = 0; i < a.length-1; i++) {
//             if(a[i]==a[i+1])
//             {
//                 continue;
//             }
//             else
//                 x=a[i+1];
//
//         }
//         return x;
         //~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~

//
//         Arrays.sort(nums);                          //Sort the array
//         for(int i=0 ; i<nums.length-1; i+=2){
//             if(nums[i]!=nums[i+1])                  //Check pairwise values in array
//                 return nums[i];                     //if any pairwise values are different, then it is answer
//         }
//         return nums[nums.length - 1];       //if answer is largest value, then it will not be detected in above loop hence return it here

     }
}
