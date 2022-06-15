package com.binarysearchq.questions;

import javax.swing.text.DefaultStyledDocument;

public class ArrangingCoins {
 //   Here we need to find largest K that satisfies this equation K*(K+1)/2 <= N.
 public static void main(String[] args) {
int n=5;
     System.out.println(arrangeCoins(n));
 }
    static int arrangeCoins(int n) {
  //  O(1) //   return (int) (Math.sqrt(2 * (long) n + 0.25) - 0.5);

//        //O(n)
//        int i=1; // 1 coin is placed at begin
//        int count=0;// if n=0 res=0 no. of row initialised to 0
//
//        while(n>=i)
//        {
//            n=n-i;
//            count++;  //counting row
//            i++;      // increasing no. of coin
//        }
//        return count;

        //O(log(n))
        long start = 0;
        long end = n;
        while (start <= end) {
            long mid = start + (end - start) / 2;
            if (n >= (mid * (mid + 1) / 2)) // finding greatest mid <=n
                start = mid + 1;
            else
                end = mid - 1;

        }
 return (int) end;
// Since at this point start > end, start will start pointing to a value greater
        // than the desired result. We will return end as it will point to the correct
        // int value.

    }
}
