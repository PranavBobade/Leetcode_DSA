package com.bit_manipulation;

public class HammingDistance {
    public static void main(String[] args) {
      int  x = 1, y = 4;
        System.out.println(hammingDistance(x,y));
    }
//    static int hammingDistance(int x, int y) {
//        int ans = x ^ y;
//        return countSetBit(ans);
//    }
//    static int countSetBit(int n){
//        int count = 0;
//
//        while(n > 0)
//        {
//            int last = n & 1;
//            if(last == 1)
//                count++;
//            n = n >> 1;
//        }
//        return count;
//    }

    static int hammingDistance(int x, int y) {
        int ans = x ^ y;
        return Integer.bitCount(ans);
    }
}
