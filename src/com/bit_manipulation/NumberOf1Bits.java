package com.bit_manipulation;

public class NumberOf1Bits {
    public static void main(String[] args) {
       int n = 00000000000000000000000000001011;
       //11111111111111111111111111111101
        System.out.println(hammingWeight(n));
    }
    static int hammingWeight(int n) {
        int count =  32;
        int ans = 0;

        while(count >0)
        {
            int last = n & 1;

            if( last == 1)
                ans++;

            n = n >> 1;
            count--;
        }
        return ans;
    }
}
