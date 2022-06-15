package com.bit_manipulation;

import java.util.Arrays;

public class CountingBits {
    public static void main(String[] args) {
       int  n = 2;
        System.out.println(Arrays.toString(countBits(n)));
    }
    static int[] countBits(int n) {
        int ans[] = new int[n + 1];

        int j = 0;
        for (int i = 0; i <= n; i++) {
            int res = 0;
            int num = i;

            while (num > 0) {  //finding count for every i from 0 to n
                int last = num & 1;

                if (last == 1)
                    res++;

                num = num >> 1;
            }
            ans[j++] = res;


        }
        return ans;
// ~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~
//        int[] f = new int[n + 1];
//        for (int i=1; i<=n; i++) f[i] = f[i >> 1] + (i & 1);
//        return f;

        ///```````````````````````````````````

//        int[] arr = new int[n+1];
//
//        int i = n;
//
//        while(i >= 0){
//            arr[i] = countSetsBit(i);
//            i--;
//        }
//
//        return arr;
//    }
//
//    static int countSetsBit(int n){
//        int count = 0;
//
//        while(n > 0){
//            int last = n & 1;
//
//            if(last == 1)
//                count++;
//
//            n = n >> 1;
//        }
//
//        return count;
    }
}
