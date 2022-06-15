package com.math_for_dsa;

public class SquareRootOfNumber {
    public static void main(String[] args) {
        int n = 4;
        System.out.println(root(n));
    }

     static int root(int n) {
      //   O(n)
         for (int i = 1; i <=n/2 ; i++) {
             if(i*i == n)
             {
                 return i;
             }
         }
         return -1;

         // for perfect square numbers only

    }
}
