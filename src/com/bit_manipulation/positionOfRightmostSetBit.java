package com.bit_manipulation;

public class positionOfRightmostSetBit {
    public static void main(String[] args) {

        int n = 10;//1010
        Integer ans = (n & (-n));
        System.out.println(ans);
        System.out.println(Integer.toBinaryString(ans));
    }
}
