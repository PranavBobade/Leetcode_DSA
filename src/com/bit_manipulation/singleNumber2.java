package com.bit_manipulation;

public class singleNumber2 {
    public static void main(String[] args) {
        int a[]={2,2,3,2};
        System.out.println(findUnique(a));
    }

     static int findUnique(int[] nums) {
        //O(n^2) approach
//        int count=0;
//         for (int i = 0; i <a.length ; i++) {
//             count=0;
//             for (int j = 0; j < a.length; j++) {
//                 int max=a[i];
//                 if(max==a[j])
//                     count++;
//             }
//             if(count==1)
//                 return a[i];
//         }
//         return -1;
//`````````````````````````````````````````````````````````````````````

//         int ans = 0;
//         for(int i = 0; i < 32; i++) {
//             int sum = 0;
//             for(int j = 0; j < nums.length; j++) {
//                 if(((nums[j] >> i) & 1) == 1) {
//                     sum++;
//                     sum %= 3;
//                 }
//             }
//             if(sum != 0) {
//                 ans |= sum << i;
//             }
//         }
//         return ans;
//~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~
//         int ones=0,two=0;
//         for(int i:nums){
//             ones=ones^i & (~two);
//             two= two^i&(~ones);
//         }
//         return ones;
//~`````````````````````````````````````````````````````````
         //O(n)
         byte sizeof_int = 4;
         int INT_SIZE = 8 * sizeof_int;
         int count[] = new int[INT_SIZE]; // no. considered as 32 bit

         // AND(bitwise) each element of the array
         // with each set digit (one at a time)
         // to get the count of set bits at each
         // position
         for (int i = 0; i < INT_SIZE; i++)
             for (int j = 0; j < nums.length; j++)
                 if ((nums[j] & (1 << i)) != 0)  //for each current number its set bit count is added in count array
                     count[i] += 1;

         // Now consider all bits whose count is
         // not multiple of k to form the required
         // number.
         int res = 0;
         for (int i = 0; i < INT_SIZE; i++)
             res += (count[i] % 3) * (1 << i);     //each element's remainder is taken and left shift is done to get desired decimal result.
         return res;
     }
}
