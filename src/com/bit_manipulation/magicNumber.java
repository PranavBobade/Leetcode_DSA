package com.bit_manipulation;

public class magicNumber {
    public static void main(String[] args) {
        //O(logn)

        int n = 5;
        int ans = 0;
        int base = 5;
        while(n>0)
        {
           int last = n&1;
           n = n >> 1;
           ans += last * base;
           base = base * 5;
        }
        System.out.println(ans);
    }
}
